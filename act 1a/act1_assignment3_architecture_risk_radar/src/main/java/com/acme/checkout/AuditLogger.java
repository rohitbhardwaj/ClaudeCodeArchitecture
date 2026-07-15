package com.acme.checkout;

/**
 * Audit logging boundary.
 *
 * <p>Observability risk:
 * Discount decisions should usually be traceable without logging sensitive data.
 */
public interface AuditLogger {
    void info(String message);
    void warn(String message);
}
