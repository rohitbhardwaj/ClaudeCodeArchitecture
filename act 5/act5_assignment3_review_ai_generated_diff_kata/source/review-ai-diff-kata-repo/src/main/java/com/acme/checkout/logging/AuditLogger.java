package com.acme.checkout.logging;

public class AuditLogger {

    public void logCouponFailure(String correlationId, String reasonCode) {
        System.out.println("coupon_failure correlationId=" + correlationId + " reasonCode=" + reasonCode);
    }
}
