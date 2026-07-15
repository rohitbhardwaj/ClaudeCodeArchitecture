package com.acme.checkout;

/** Inventory availability result. */
public class InventoryStatus {
    private final boolean available;

    public InventoryStatus(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() { return available; }
}
