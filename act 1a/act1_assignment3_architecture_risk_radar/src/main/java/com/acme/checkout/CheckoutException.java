package com.acme.checkout;

/**
 * Runtime exception for checkout failures.
 *
 * <p>API compatibility question:
 * Does throwing this exception preserve the public API contract, or did the prior
 * service return structured error responses?
 */
public class CheckoutException extends RuntimeException {
    public CheckoutException(String message) {
        super(message);
    }
}
