package com.acme.checkout;

/** Result from the payment gateway. */
public class PaymentResult {
    private final boolean approved;
    private final String paymentId;

    public PaymentResult(boolean approved, String paymentId) {
        this.approved = approved;
        this.paymentId = paymentId;
    }

    public boolean isApproved() { return approved; }
    public String getPaymentId() { return paymentId; }
}
