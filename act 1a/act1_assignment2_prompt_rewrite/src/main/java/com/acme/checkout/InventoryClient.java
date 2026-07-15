package com.acme.checkout;

/** Inventory integration boundary. */
public interface InventoryClient {
    /** Checks whether the requested SKU and quantity are available before payment. */
    InventoryStatus checkAvailability(String sku, int quantity);
}
