package com.acme.checkout;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Orchestrates checkout.
 *
 * <p>Scenario note:
 * The weak prompt says: "Fix the bug in CheckoutService.java."
 *
 * <p>But this class may only be where the symptom appears.
 * The root cause may be in coupon validation, pricing, controller mapping,
 * API contracts, or tests.
 */
public class CheckoutService {

    private final PricingCalculator pricingCalculator;
    private final CouponValidator couponValidator;
    private final PaymentClient paymentClient;
    private final OrderRepository orderRepository;

    public CheckoutService(
            PricingCalculator pricingCalculator,
            CouponValidator couponValidator,
            PaymentClient paymentClient,
            OrderRepository orderRepository
    ) {
        this.pricingCalculator = pricingCalculator;
        this.couponValidator = couponValidator;
        this.paymentClient = paymentClient;
        this.orderRepository = orderRepository;
    }

    /**
     * Performs checkout.
     *
     * <p>Important behavior to preserve:
     *
     * <ul>
     *   <li>Invalid coupons return {@code INVALID_COUPON}.</li>
     *   <li>Payment declines return {@code PAYMENT_DECLINED}.</li>
     *   <li>Public API behavior must remain stable.</li>
     *   <li>Payment token must not be logged.</li>
     * </ul>
     */
    public CheckoutResponse checkout(CheckoutRequest request) {
        if (request == null || request.getItems() == null || request.getItems().isEmpty()) {
            return CheckoutResponse.failure("INVALID_REQUEST", "Checkout request is invalid.");
        }

        CouponResult couponResult = couponValidator.validate(request.getCouponCode());

        if (!couponResult.isValid()) {
            return CheckoutResponse.failure("INVALID_COUPON", "Coupon is invalid.");
        }

        BigDecimal subtotal = pricingCalculator.subtotal(request.getItems());
        BigDecimal discount = pricingCalculator.discount(subtotal, couponResult.getDiscountPercent());
        BigDecimal tax = pricingCalculator.tax(subtotal.subtract(discount));
        BigDecimal total = pricingCalculator.total(subtotal, discount, tax);

        PaymentResult paymentResult = paymentClient.charge(
                request.getPaymentToken(),
                total,
                request.getCustomerId()
        );

        if (!paymentResult.isApproved()) {
            return CheckoutResponse.failure("PAYMENT_DECLINED", "Payment was declined.");
        }

        String orderId = UUID.randomUUID().toString();

        orderRepository.save(new Order(orderId, request.getCustomerId(), subtotal, discount, tax, total));

        return CheckoutResponse.success(orderId, total);
    }
}
