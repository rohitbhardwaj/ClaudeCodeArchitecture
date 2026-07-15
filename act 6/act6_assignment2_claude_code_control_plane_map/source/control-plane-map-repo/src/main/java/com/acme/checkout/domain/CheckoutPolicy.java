package com.acme.checkout.domain;

public class CheckoutPolicy {
    public boolean accepts(int amountCents) {
        return amountCents > 0;
    }
}
