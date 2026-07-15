package com.acme.checkout;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Simulated checkout service after Claude Code added discount support.
 *
 * <p>Teaching purpose:
 * This class looks cleaner after pricing logic is extracted, but the PR introduces
 * architecture and production risks.
 *
 * <p>Participants should use this class to fill out the Architecture Risk Radar.
 */
public class CheckoutService {

    private final PaymentClient paymentClient;
    private final OrderRepository orderRepository;
    private final AuditLogger auditLogger;

    /**
     * Claude introduced this calculator directly.
     *
     * <p>Architecture concern:
     * Direct construction makes it harder to inject promotion policy, feature flags,
     * tax policy, or test doubles.
     */
    private final PricingCalculator pricingCalculator = new PricingCalculator();

    public CheckoutService(
            PaymentClient paymentClient,
            OrderRepository orderRepository,
            AuditLogger auditLogger
    ) {
        this.paymentClient = paymentClient;
        this.orderRepository = orderRepository;
        this.auditLogger = auditLogger;
    }

    /**
     * Performs checkout and returns a receipt.
     *
     * <p>Risk radar review points:
     *
     * <ul>
     *   <li>Behavior: discount changes final total and tax basis.</li>
     *   <li>Security: discount is accepted directly from the client.</li>
     *   <li>Data model: discount code is not persisted in the order record.</li>
     *   <li>Observability: discount acceptance or rejection is not logged.</li>
     *   <li>Rollback: no feature flag exists.</li>
     * </ul>
     */
    public Receipt checkout(CheckoutRequest request) {
        BigDecimal subtotal = pricingCalculator.calculateSubtotal(request);

        /**
         * Security and business risk:
         * The discount code is applied without checking customer eligibility,
         * campaign status, expiration, fraud controls, or authorization.
         */
        BigDecimal discountAmount = pricingCalculator.calculateDiscount(
                request.getDiscountCode(),
                subtotal
        );

        /**
         * Behavior risk:
         * Tax is calculated after discount.
         * This may change existing business behavior and may require product/finance/legal approval.
         */
        BigDecimal tax = pricingCalculator.calculateTax(subtotal, discountAmount);

        BigDecimal total = pricingCalculator.calculateTotal(subtotal, discountAmount, tax);

        /**
         * Payment is charged using the discounted total.
         *
         * Review question:
         * Does the payment system need metadata explaining the discount?
         */
        PaymentResult result = paymentClient.charge(
                request.getPaymentToken(),
                total,
                request.getCustomerId()
        );

        if (!result.isApproved()) {
            auditLogger.warn("Payment failed for customerId=" + request.getCustomerId());
            throw new CheckoutException("Payment failed");
        }

        String orderId = UUID.randomUUID().toString();

        /**
         * Data model risk:
         * The order record does not store discountCode or discountAmount.
         * Refunds, support, analytics, and finance may not be able to reconstruct
         * why the customer paid this amount.
         */
        Order order = new Order(
                orderId,
                request.getCustomerId(),
                subtotal,
                tax,
                total
        );

        orderRepository.save(order);

        /**
         * Observability risk:
         * This log says checkout succeeded but does not explain whether a discount
         * was applied, which code was used, whether it was valid, or whether it was feature-flagged.
         */
        auditLogger.info("Checkout completed orderId=" + orderId);

        return new Receipt(orderId, subtotal, discountAmount, tax, total);
    }
}
