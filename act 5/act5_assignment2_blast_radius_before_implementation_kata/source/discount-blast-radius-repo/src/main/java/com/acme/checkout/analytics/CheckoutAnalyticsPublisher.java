package com.acme.checkout.analytics;

/**
 * Analytics impact:
 * Track accepted and rejected coupon events.
 */
public class CheckoutAnalyticsPublisher {
    public void couponEvent(String outcome, String reasonCode) {
        System.out.println("coupon_event outcome=" + outcome + " reasonCode=" + reasonCode);
    }
}
