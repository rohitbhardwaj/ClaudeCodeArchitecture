package com.acme.checkout;

/**
 * Payment result returned by the payment boundary.
 */
public class PaymentResult {

    private final boolean approved;

    public PaymentResult(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }
}
