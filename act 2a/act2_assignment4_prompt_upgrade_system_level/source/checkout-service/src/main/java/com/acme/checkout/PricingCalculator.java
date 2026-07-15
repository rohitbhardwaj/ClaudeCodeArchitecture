package com.acme.checkout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Owns pricing math for checkout.
 *
 * <p>System-level prompting note:
 * A checkout bug investigation should inspect pricing because a local fix could
 * accidentally change totals, tax, or payment amount.
 */
public class PricingCalculator {

    private static final BigDecimal TAX_RATE = new BigDecimal("0.0625");

    public BigDecimal subtotal(List<CheckoutItem> items) {
        return items.stream()
                .map(item -> item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal discount(BigDecimal subtotal, int discountPercent) {
        return subtotal
                .multiply(BigDecimal.valueOf(discountPercent))
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal tax(BigDecimal taxableAmount) {
        return taxableAmount.multiply(TAX_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal total(BigDecimal subtotal, BigDecimal discount, BigDecimal tax) {
        return subtotal.subtract(discount).add(tax).setScale(2, RoundingMode.HALF_UP);
    }
}
