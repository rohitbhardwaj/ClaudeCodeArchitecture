package com.acme.checkout;

/**
 * Persistence boundary for orders.
 */
public interface OrderRepository {
    void save(Order order);
}
