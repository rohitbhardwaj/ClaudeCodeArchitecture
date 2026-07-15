package com.acme.checkout;

import java.math.BigDecimal;

/**
 * Persisted order record.
 *
 * <p>Data model risk:
 * Notice that this entity stores subtotal, tax, and total, but not:
 *
 * <ul>
 *   <li>discount code</li>
 *   <li>discount amount</li>
 *   <li>discount campaign id</li>
 *   <li>approval or eligibility reason</li>
 * </ul>
 *
 * <p>This creates downstream risk for refunds, audits, support, analytics, and finance.
 */
public class Order {

    private final String orderId;
    private final String customerId;
    private final BigDecimal subtotal;
    private final BigDecimal tax;
    private final BigDecimal total;

    public Order(
            String orderId,
            String customerId,
            BigDecimal subtotal,
            BigDecimal tax,
            BigDecimal total
    ) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.subtotal = subtotal;
        this.tax = tax;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
