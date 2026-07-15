package com.acme.checkout;

import java.math.BigDecimal;

/**
 * Response returned to clients after checkout.
 *
 * <p>Risk radar focus:
 * API compatibility risk lives here.
 *
 * <p>If clients previously expected only {@code subtotal}, {@code tax}, and {@code total},
 * adding or changing the meaning of {@code discountAmount} may be acceptable only if:
 *
 * <ul>
 *   <li>The API contract allows additive fields.</li>
 *   <li>The meaning of {@code total} remains stable.</li>
 *   <li>Mobile clients, web clients, support tools, and analytics are compatible.</li>
 * </ul>
 */
public class Receipt {

    private final String orderId;
    private final BigDecimal subtotal;
    private final BigDecimal discountAmount;
    private final BigDecimal tax;
    private final BigDecimal total;

    public Receipt(
            String orderId,
            BigDecimal subtotal,
            BigDecimal discountAmount,
            BigDecimal tax,
            BigDecimal total
    ) {
        this.orderId = orderId;
        this.subtotal = subtotal;
        this.discountAmount = discountAmount;
        this.tax = tax;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
