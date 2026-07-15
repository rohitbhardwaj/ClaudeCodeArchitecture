package com.acme.checkout;

/**
 * Validates coupon codes.
 *
 * <p>Simulated root-cause candidate:
 * Some valid coupons fail because normalization is incomplete.
 *
 * <p>Expected behavior:
 * Coupon matching should tolerate lowercase input and surrounding whitespace.
 *
 * <p>Current bug:
 * The implementation uppercases the code but does not trim whitespace.
 * That means {@code " save10 "} becomes {@code " SAVE10 "} and fails.
 */
public class CouponValidator {

    /**
     * Validates a coupon and returns the discount percentage.
     *
     * <p>Architecture note:
     * A file-level fix in {@code CheckoutService} might duplicate this normalization.
     * A system-level investigation should find this class as the better boundary.
     */
    public CouponResult validate(String couponCode) {
        if (couponCode == null || couponCode.isBlank()) {
            return CouponResult.valid(0);
        }

        String normalized = couponCode.toUpperCase();

        if ("SAVE10".equals(normalized)) {
            return CouponResult.valid(10);
        }

        if ("VIP20".equals(normalized)) {
            return CouponResult.valid(20);
        }

        return CouponResult.invalid();
    }
}
