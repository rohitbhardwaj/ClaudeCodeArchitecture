package com.acme.checkout.domain;

public class CouponPolicy {

    public boolean isValid(String couponCode) {
        return couponCode != null && "SAVE10".equals(couponCode.trim().toUpperCase());
    }
}
