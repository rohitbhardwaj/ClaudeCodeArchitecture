package com.acme.checkout;

/**
 * Persistence boundary for completed orders.
 */
public interface OrderRepository {
    void save(Order order);
}
