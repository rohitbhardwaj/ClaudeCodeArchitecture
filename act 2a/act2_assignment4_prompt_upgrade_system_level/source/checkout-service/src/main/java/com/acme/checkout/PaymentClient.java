package com.acme.checkout;

import java.math.BigDecimal;

/**
 * Payment system boundary.
 *
 * <p>Prompt constraint:
 * Do not change payment behavior without approval.
 */
public interface PaymentClient {
    PaymentResult charge(String paymentToken, BigDecimal amount, String customerId);
}
