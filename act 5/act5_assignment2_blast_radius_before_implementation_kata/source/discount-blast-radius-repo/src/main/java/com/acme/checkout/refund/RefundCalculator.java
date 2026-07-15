package com.acme.checkout.refund;

/**
 * Refund impact:
 * Refund amount must account for original discount.
 */
public class RefundCalculator {
    public int refundableAmount(int paidAmountCents, int returnedItemCents) {
        return Math.min(paidAmountCents, returnedItemCents);
    }
}
