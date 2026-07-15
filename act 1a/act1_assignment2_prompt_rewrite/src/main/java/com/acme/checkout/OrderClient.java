package com.acme.checkout;

import java.math.BigDecimal;
import java.util.List;

/** Order creation integration boundary. */
public interface OrderClient {
    /**
     * Creates an order after payment is approved.
     *
     * <p>Teaching point: If Claude moves order creation logic into checkout, it
     * is changing architecture boundaries.</p>
     */
    String createOrder(String customerId, String cartId, List<CheckoutItem> items, BigDecimal total, String paymentId);
}
