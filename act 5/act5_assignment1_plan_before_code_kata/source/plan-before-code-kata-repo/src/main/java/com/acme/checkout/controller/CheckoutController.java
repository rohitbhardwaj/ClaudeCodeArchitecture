package com.acme.checkout.controller;

import com.acme.checkout.service.CheckoutService;

public class CheckoutController {
    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public String checkout(int cartTotalCents) {
        return checkoutService.checkout(cartTotalCents);
    }
}
