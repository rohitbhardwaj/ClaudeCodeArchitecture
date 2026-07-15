package com.acme.checkout;

import java.util.List;

/**
 * Checkout request from the API layer.
 */
public class CheckoutRequest {

    private final String customerId;
    private final List<CheckoutItem> items;
    private final String paymentToken;
    private final String couponCode;

    public CheckoutRequest(
            String customerId,
            List<CheckoutItem> items,
            String paymentToken,
            String couponCode
    ) {
        this.customerId = customerId;
        this.items = items;
        this.paymentToken = paymentToken;
        this.couponCode = couponCode;
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

    public String getCouponCode() {
        return couponCode;
    }
}
