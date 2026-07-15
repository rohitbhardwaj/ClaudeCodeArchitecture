package com.acme.checkout;

/** Simplified audit logger. */
public interface AuditLogger {
    /** Logs an informational operational event. Must not include secrets or payment tokens. */
    void info(String message);

    /** Logs a warning operational event. Must not include secrets or payment tokens. */
    void warn(String message);
}
