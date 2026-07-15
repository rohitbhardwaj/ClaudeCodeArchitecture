package com.acme.checkout;

import java.math.BigDecimal;

/**
 * Item in a checkout request.
 */
public class CheckoutItem {

    private final String sku;
    private final int quantity;
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
