package com.acme.checkout;

import java.math.BigDecimal;

/** Payment integration boundary. */
public interface PaymentGateway {
    /**
     * Authorizes and captures a payment.
     *
     * <p>Teaching point: This is high risk. Claude Code should not change payment
     * flow, request sequence, or token handling without explicit approval.</p>
     */
    PaymentResult authorizeAndCapture(String paymentToken, BigDecimal amount, String customerId);
}
