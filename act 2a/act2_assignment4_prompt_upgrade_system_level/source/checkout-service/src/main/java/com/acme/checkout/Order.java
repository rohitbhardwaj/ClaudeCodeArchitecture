package com.acme.checkout;

import java.math.BigDecimal;

/**
 * Persisted order.
 */
public class Order {

    private final String orderId;
    private final String customerId;
    private final BigDecimal subtotal;
    private final BigDecimal discount;
    private final BigDecimal tax;
    private final BigDecimal total;

    public Order(
            String orderId,
            String customerId,
            BigDecimal subtotal,
            BigDecimal discount,
            BigDecimal tax,
            BigDecimal total
    ) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.subtotal = subtotal;
        this.discount = discount;
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

    public BigDecimal getDiscount() {
        return discount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
