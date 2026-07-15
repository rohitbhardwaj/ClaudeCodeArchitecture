package com.acme.checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {

    @Test
    void happyPathReturnsOk() {
        assertEquals("OK", new CheckoutService().checkout(true));
    }

    @Test
    void failurePathReturnsInvalidRequest() {
        assertEquals("INVALID_REQUEST", new CheckoutService().checkout(false));
    }
}
