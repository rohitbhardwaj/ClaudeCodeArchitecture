package com.acme.checkout.observability;

/**
 * Observability impact:
 * Log safe reason codes, not PII.
 */
public class SafeLogger {
    public void discountDecision(String correlationId, String reasonCode) {
        System.out.println("discount_decision correlationId=" + correlationId + " reasonCode=" + reasonCode);
    }
}
