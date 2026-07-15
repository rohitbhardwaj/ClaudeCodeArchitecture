package com.acme.checkout.payment;

/**
 * Payment logic: Ask first.
 * Approval owner: payments/finance.
 */
public class PaymentService {
    public boolean charge(int amountCents) {
        return amountCents > 0;
    }
}
