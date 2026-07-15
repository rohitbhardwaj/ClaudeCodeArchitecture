package com.acme.checkout;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Claude-generated helper class for pricing.
 *
 * <p>At first glance, extracting pricing into a helper looks cleaner.
 * But architects must inspect whether the helper preserves business behavior.
 *
 * <p>Risk radar focus:
 *
 * <ul>
 *   <li>Behavior risk: Did tax calculation change?</li>
 *   <li>Coupling risk: Did checkout duplicate promotion logic?</li>
 *   <li>Security risk: Are discount codes authorized or just trusted?</li>
 *   <li>Rollback risk: Can discounts be disabled?</li>
 * </ul>
 */
public class PricingCalculator {

    /**
     * Fixed tax rate used by the simulated legacy checkout.
     *
     * <p>Teaching note:
     * Hard-coded tax rates are usually suspicious in production systems.
     * The assignment uses this for simplicity.
     */
    private static final BigDecimal TAX_RATE = new BigDecimal("0.0625");

    /**
     * Calculates subtotal from item prices and quantities.
     *
     * <p>This part is straightforward arithmetic, but still needs tests for:
     *
     * <ul>
     *   <li>zero quantity</li>
     *   <li>negative quantity</li>
     *   <li>null price</li>
     *   <li>rounding behavior</li>
     * </ul>
     */
    public BigDecimal calculateSubtotal(CheckoutRequest request) {
        return request.getItems()
                .stream()
                .map(item -> item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Applies a discount code directly inside checkout pricing.
     *
     * <p>Major architecture issue:
     * This method treats discount validation as a local string comparison.
     * It does not call a PromotionService, DiscountPolicy, eligibility service,
     * fraud service, or authorization boundary.
     *
     * <p>Specific risks:
     *
     * <ul>
     *   <li>Any customer can use {@code VIP50}.</li>
     *   <li>No expiration date is checked.</li>
     *   <li>No customer eligibility is checked.</li>
     *   <li>No usage limit is checked.</li>
     *   <li>No audit event is emitted.</li>
     *   <li>No feature flag can disable the discount quickly.</li>
     * </ul>
     */
    public BigDecimal calculateDiscount(String discountCode, BigDecimal subtotal) {
        if (discountCode == null || discountCode.isBlank()) {
            return BigDecimal.ZERO;
        }

        if ("VIP50".equalsIgnoreCase(discountCode)) {
            return subtotal.multiply(new BigDecimal("0.50"));
        }

        if ("SAVE10".equalsIgnoreCase(discountCode)) {
            return subtotal.multiply(new BigDecimal("0.10"));
        }

        /**
         * Risk:
         * Unknown discount codes silently receive no discount.
         *
         * Architect question:
         * Should invalid codes return an error, a warning, an audit event, or a support-visible reason?
         */
        return BigDecimal.ZERO;
    }

    /**
     * Calculates tax after discount.
     *
     * <p>Behavior risk:
     * This changes the tax basis from subtotal to discounted subtotal.
     * That may be correct in some contexts and incorrect in others.
     *
     * <p>Architect question:
     * Who approved the tax semantics?
     */
    public BigDecimal calculateTax(BigDecimal subtotal, BigDecimal discountAmount) {
        BigDecimal taxableAmount = subtotal.subtract(discountAmount);
        return taxableAmount.multiply(TAX_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Calculates final total.
     *
     * <p>Risk:
     * The method allows the discount to exceed subtotal if a future discount rule returns
     * too much. This can produce negative taxable amounts or totals unless protected.
     */
    public BigDecimal calculateTotal(BigDecimal subtotal, BigDecimal discountAmount, BigDecimal tax) {
        return subtotal.subtract(discountAmount).add(tax);
    }
}
