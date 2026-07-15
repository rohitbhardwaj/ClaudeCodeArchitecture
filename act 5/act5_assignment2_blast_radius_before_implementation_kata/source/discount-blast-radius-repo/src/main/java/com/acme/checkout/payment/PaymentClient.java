package com.acme.checkout.payment;

/**
 * Payment impact:
 * Charged amount changes when discount is applied.
 */
public interface PaymentClient {
    boolean charge(String paymentToken, int amountCents);
}
