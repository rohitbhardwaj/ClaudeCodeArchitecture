package com.acme.checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {

    @Test
    void happyPath() {
        assertEquals("OK", new CheckoutService().checkout(true));
    }

    @Test
    void failurePath() {
        assertEquals("INVALID", new CheckoutService().checkout(false));
    }
}
