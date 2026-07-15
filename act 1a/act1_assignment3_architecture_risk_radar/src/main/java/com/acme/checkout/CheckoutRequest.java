package com.acme.checkout;

import java.util.List;

/**
 * Represents the input to checkout.
 *
 * <p>Teaching purpose:
 * This class includes the new {@code discountCode} field added by the simulated
 * Claude Code implementation.
 *
 * <p>Architectural issue to discuss:
 * Adding a request field is not automatically wrong, but architects must ask:
 *
 * <ul>
 *   <li>Is this API backward compatible?</li>
 *   <li>Should this field be accepted directly from clients?</li>
 *   <li>Does applying a discount require authorization or eligibility checks?</li>
 *   <li>Is this field documented for external clients?</li>
 * </ul>
 */
public class CheckoutRequest {

    /**
     * The customer attempting checkout.
     *
     * <p>This value is business-sensitive because pricing, discounts, and eligibility
     * may depend on the customer.
     */
    private final String customerId;

    /**
     * The items being purchased.
     *
     * <p>Each item contributes to subtotal, tax, and final total.
     */
    private final List<CheckoutItem> items;

    /**
     * Payment token used to charge the customer.
     *
     * <p>Security note:
     * This value must never be logged.
     */
    private final String paymentToken;

    /**
     * Optional discount code.
     *
     * <p>Risk radar note:
     * A discount code is not just a string. It may require expiration checks,
     * customer eligibility checks, authorization, fraud controls, and auditability.
     */
    private final String discountCode;

    public CheckoutRequest(
            String customerId,
            List<CheckoutItem> items,
            String paymentToken,
            String discountCode
    ) {
        this.customerId = customerId;
        this.items = items;
        this.paymentToken = paymentToken;
        this.discountCode = discountCode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<CheckoutItem> getItems() {
        return items;
    }

    public String getPaymentToken() {
        return paymentToken;
    }

    public String getDiscountCode() {
        return discountCode;
    }
}
