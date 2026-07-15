package com.acme.checkout.domain;

public class CouponPolicy {
    public boolean isValid(String couponCode) {
        return couponCode != null && !couponCode.isBlank();
    }
}
