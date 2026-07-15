package com.acme.checkout.api;

/**
 * API contract impact:
 * Discount fields affect clients and support tools.
 */
public record CheckoutReceipt(
        int subtotalCents,
        int taxCents,
        int totalCents,
        String discountCode,
        int discountAmountCents,
        String discountReasonCode
) {}
