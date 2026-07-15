package com.acme.checkout;

import java.math.BigDecimal;

/**
 * Represents a line item in checkout.
 *
 * <p>Teaching purpose:
 * This class is intentionally simple so the assignment can focus on pricing,
 * discount, tax, and risk-radar thinking.
 */
public class CheckoutItem {

    /**
     * Product identifier.
     */
    private final String sku;

    /**
     * Quantity requested.
     */
    private final int quantity;

    /**
     * Unit price at time of checkout.
     *
     * <p>Architectural note:
     * Real systems often need a pricing service or price snapshot to avoid
     * inconsistent calculations across checkout, invoices, refunds, and analytics.
     */
    private final BigDecimal unitPrice;

    public CheckoutItem(String sku, int quantity, BigDecimal unitPrice) {
        this.sku = sku;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getSku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
}
