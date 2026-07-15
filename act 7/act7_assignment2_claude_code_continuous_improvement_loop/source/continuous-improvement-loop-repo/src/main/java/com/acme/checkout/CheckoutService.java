package com.acme.checkout;

public class CheckoutService {
    public String checkout(boolean valid) {
        return valid ? "OK" : "INVALID";
    }
}
