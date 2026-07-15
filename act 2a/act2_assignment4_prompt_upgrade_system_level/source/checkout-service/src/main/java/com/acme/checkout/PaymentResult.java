package com.acme.checkout;

/**
 * Result from payment provider.
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
