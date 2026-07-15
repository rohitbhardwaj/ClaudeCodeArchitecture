package com.acme.checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for coupon validation.
 *
 * <p>Teaching note:
 * A system-level prompt should ask Claude to inspect this test file before coding.
 */
class CouponValidatorTest {

    private final CouponValidator couponValidator = new CouponValidator();

    @Test
    void acceptsUppercaseCoupon() {
        CouponResult result = couponValidator.validate("SAVE10");

        assertTrue(result.isValid());
        assertEquals(10, result.getDiscountPercent());
    }

    @Test
    void acceptsLowercaseCoupon() {
        CouponResult result = couponValidator.validate("save10");

        assertTrue(result.isValid());
        assertEquals(10, result.getDiscountPercent());
    }

    @Test
    void shouldAcceptCouponWithSurroundingWhitespace() {
        CouponResult result = couponValidator.validate(" save10 ");

        /**
         * This test documents intended behavior.
         *
         * Current implementation fails this test because CouponValidator uppercases
         * but does not trim.
         */
        assertTrue(result.isValid());
        assertEquals(10, result.getDiscountPercent());
    }

    @Test
    void rejectsUnknownCoupon() {
        CouponResult result = couponValidator.validate("NOTREAL");

        assertFalse(result.isValid());
    }
}
