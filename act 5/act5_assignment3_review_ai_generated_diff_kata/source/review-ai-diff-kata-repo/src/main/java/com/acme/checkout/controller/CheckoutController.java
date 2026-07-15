package com.acme.checkout.controller;

import com.acme.checkout.service.CheckoutService;

/**
 * Controller boundary:
 * Do not move coupon validation here.
 */
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public String checkout(String couponCode, String customerEmail) {
        return checkoutService.checkout(couponCode, customerEmail);
    }
}
