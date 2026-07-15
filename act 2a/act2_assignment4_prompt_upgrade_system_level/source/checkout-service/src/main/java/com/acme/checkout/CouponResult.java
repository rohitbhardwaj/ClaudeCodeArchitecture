package com.acme.checkout;

/**
 * Result of coupon validation.
 */
public class CouponResult {

    private final boolean valid;
    private final int discountPercent;

    private CouponResult(boolean valid, int discountPercent) {
        this.valid = valid;
        this.discountPercent = discountPercent;
    }

    public static CouponResult valid(int discountPercent) {
        return new CouponResult(true, discountPercent);
    }

    public static CouponResult invalid() {
        return new CouponResult(false, 0);
    }

    public boolean isValid() {
        return valid;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
