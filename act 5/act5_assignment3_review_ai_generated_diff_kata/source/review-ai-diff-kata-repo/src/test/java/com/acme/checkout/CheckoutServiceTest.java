package com.acme.checkout;

import com.acme.checkout.domain.CouponPolicy;
import com.acme.checkout.logging.AuditLogger;
import com.acme.checkout.service.CheckoutService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {

    @Test
    void invalidCouponPreservesPublicErrorCode() {
        CheckoutService service = new CheckoutService(new CouponPolicy(), new AuditLogger());

        assertEquals("INVALID_COUPON", service.checkout("BAD", "customer@example.com"));
    }

    @Test
    void validCouponWithWhitespaceWorks() {
        CheckoutService service = new CheckoutService(new CouponPolicy(), new AuditLogger());

        assertEquals("OK", service.checkout(" save10 ", "customer@example.com"));
    }
}
