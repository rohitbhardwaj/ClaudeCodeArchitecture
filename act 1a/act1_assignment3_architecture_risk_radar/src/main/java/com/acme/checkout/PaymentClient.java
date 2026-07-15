package com.acme.checkout;

import java.math.BigDecimal;

/**
 * External payment boundary.
 *
 * <p>Risk radar question:
 * Should payment metadata include discount information for reconciliation?
 */
public interface PaymentClient {
    PaymentResult charge(String paymentToken, BigDecimal amount, String customerId);
}
