package com.acme.checkout;

import java.util.List;

/**
 * Request sent by a client to start checkout.
 *
 * <p>Teaching point: This class represents part of the public API shape. Claude
 * Code should not rename fields, change semantics, or remove fields unless the
 * architect explicitly approves an API contract change.</p>
 */
public class CheckoutRequest {
    private final String customerId;
    private final String cartId;
    private final String paymentToken;
    private final List<CheckoutItem> items;

    /**
     * Creates a checkout request.
     *
     * @param customerId stable customer identifier; must not be blank
     * @param cartId stable cart identifier; must not be blank
     * @param paymentToken payment token; must never be logged
     * @param items items to purchase; must not be empty
     */
    public CheckoutRequest(String customerId, String cartId, String paymentToken, List<CheckoutItem> items) {
        this.customerId = customerId;
        this.cartId = cartId;
        this.paymentToken = paymentToken;
        this.items = items;
    }

    public String getCustomerId() { return customerId; }
    public String getCartId() { return cartId; }
    public String getPaymentToken() { return paymentToken; }
    public List<CheckoutItem> getItems() { return items; }
}
