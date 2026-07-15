package com.acme.checkout.service;

import com.acme.checkout.domain.CheckoutPolicy;

public class CheckoutService {
    private final CheckoutPolicy checkoutPolicy;

    public CheckoutService(CheckoutPolicy checkoutPolicy) {
        this.checkoutPolicy = checkoutPolicy;
    }

    public String checkout(int cartTotalCents) {
        if (!checkoutPolicy.accepts(cartTotalCents)) {
            return "CHECKOUT_REJECTED";
        }

        return "OK";
    }
}
