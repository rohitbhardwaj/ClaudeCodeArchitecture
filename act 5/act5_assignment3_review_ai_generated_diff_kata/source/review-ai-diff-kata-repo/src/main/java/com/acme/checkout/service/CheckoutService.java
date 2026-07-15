package com.acme.checkout.service;

import com.acme.checkout.domain.CouponPolicy;
import com.acme.checkout.logging.AuditLogger;

public class CheckoutService {

    private final CouponPolicy couponPolicy;
    private final AuditLogger auditLogger;

    public CheckoutService(CouponPolicy couponPolicy, AuditLogger auditLogger) {
        this.couponPolicy = couponPolicy;
        this.auditLogger = auditLogger;
    }

    public String checkout(String couponCode, String customerEmail) {
        if (!couponPolicy.isValid(couponCode)) {
            auditLogger.logCouponFailure("corr-unknown", "INVALID_COUPON");
            return "INVALID_COUPON";
        }

        return "OK";
    }
}
