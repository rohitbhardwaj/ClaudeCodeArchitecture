package com.acme.checkout;

/** Cart integration boundary. */
public interface CartClient {
    /** Validates whether a cart belongs to a customer and is eligible for checkout. */
    CartStatus validateCart(String cartId, String customerId);
}
