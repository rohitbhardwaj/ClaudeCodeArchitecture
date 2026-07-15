package com.acme.checkout.pricing;

/**
 * Pricing impact:
 * Discounts change subtotal, discount, and total calculations.
 */
public class PricingCalculator {
    public int applyDiscount(int subtotalCents, int discountCents) {
        return Math.max(0, subtotalCents - discountCents);
    }
}
