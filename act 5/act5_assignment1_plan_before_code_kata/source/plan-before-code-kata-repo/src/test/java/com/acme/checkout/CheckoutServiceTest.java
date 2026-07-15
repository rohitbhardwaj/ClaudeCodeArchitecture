package com.acme.checkout;

import com.acme.checkout.domain.CheckoutPolicy;
import com.acme.checkout.service.CheckoutService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {

    @Test
    void positiveCartTotalReturnsOk() {
        CheckoutService service = new CheckoutService(new CheckoutPolicy());

        assertEquals("OK", service.checkout(1000));
    }

    @Test
    void zeroCartTotalReturnsCheckoutRejected() {
        CheckoutService service = new CheckoutService(new CheckoutPolicy());

        assertEquals("CHECKOUT_REJECTED", service.checkout(0));
    }
}
