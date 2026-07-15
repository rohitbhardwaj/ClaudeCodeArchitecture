package com.acme.checkout.config;

/**
 * Rollback impact:
 * Feature flag can disable promotional discount codes.
 */
public class FeatureFlags {
    public boolean promotionalDiscountsEnabled() {
        return false;
    }
}
