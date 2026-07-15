package com.acme.checkout;

import java.math.BigDecimal;

/**
 * One line item in checkout.
 *
 * <p>Teaching point: Validation of SKU, quantity, and price protects downstream
 * systems. A refactor must not silently weaken these rules.</p>
 */
public class CheckoutItem {
    private final String sku;
    private final int quantity;
    private final BigDecimal unitPrice;

    /**
     * @param sku stock keeping unit; must not be blank
     * @param quantity number of units; must be greater than zero
     * @param unitPrice item price; must not be negative
     */
    public CheckoutItem(String sku, int quantity, BigDecimal unitPrice) {
        this.sku = sku;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getSku() { return sku; }
    public int getQuantity() { return quantity; }
    public BigDecimal getUnitPrice() { return unitPrice; }
}
