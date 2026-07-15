package com.acme.checkout.fraud;

/**
 * Fraud impact:
 * Coupon brute force, unauthorized use, replay, and abuse must be considered.
 */
public class CouponFraudPolicy {
    public boolean allowAttempt(String customerId, int attemptsInLastHour) {
        return attemptsInLastHour < 10;
    }
}
