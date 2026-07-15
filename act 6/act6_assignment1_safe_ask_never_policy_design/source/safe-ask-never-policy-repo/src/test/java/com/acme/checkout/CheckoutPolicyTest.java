package com.acme.checkout;

import com.acme.checkout.domain.CouponPolicy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutPolicyTest {

    @Test
    void invalidCouponRejected() {
        CouponPolicy policy = new CouponPolicy();

        assertFalse(policy.isValid(""));
    }
}
