package com.acme.checkout.tax;

/**
 * Tax impact:
 * Tax basis may be before or after discount depending on jurisdiction and policy.
 */
public class TaxCalculator {
    public int taxOnDiscountedAmount(int discountedSubtotalCents) {
        return Math.round(discountedSubtotalCents * 0.0625f);
    }
}
