package com.acme.checkout;

/** Cart validation result. */
public class CartStatus {
    private final boolean valid;

    public CartStatus(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() { return valid; }
}
