package com.acme.checkout.domain;

/**
 * Domain policy.
 *
 * Potential bug area:
 * zero or negative cart totals may be rejected.
 */
public class CheckoutPolicy {
    public boolean accepts(int cartTotalCents) {
        return cartTotalCents > 0;
    }
}
