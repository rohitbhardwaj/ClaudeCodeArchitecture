package com.acme.checkout;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Tests for checkout orchestration.
 *
 * <p>Teaching note:
 * A file-level prompt might change these tests to match new behavior.
 * A system-level prompt should identify which behavior these tests protect.
 */
class CheckoutServiceTest {

    private final PricingCalculator pricingCalculator = new PricingCalculator();
    private final CouponValidator couponValidator = new CouponValidator();
    private final PaymentClient paymentClient = mock(PaymentClient.class);
    private final OrderRepository orderRepository = mock(OrderRepository.class);

    private final CheckoutService checkoutService = new CheckoutService(
            pricingCalculator,
            couponValidator,
            paymentClient,
            orderRepository
    );

    @Test
    void appliesValidCouponAndPlacesOrder() {
        CheckoutRequest request = validRequest("SAVE10");

        when(paymentClient.charge(eq("tok_123"), any(BigDecimal.class), eq("cust-123")))
                .thenReturn(new PaymentResult(true));

        CheckoutResponse response = checkoutService.checkout(request);

        assertTrue(response.isSuccess());
        assertNotNull(response.getOrderId());
        verify(orderRepository).save(any(Order.class));
    }

    @Test
    void invalidCouponReturnsPublicErrorCode() {
        CheckoutRequest request = validRequest("BADCODE");

        CheckoutResponse response = checkoutService.checkout(request);

        assertFalse(response.isSuccess());
        assertEquals("INVALID_COUPON", response.getErrorCode());
        verifyNoInteractions(paymentClient);
        verifyNoInteractions(orderRepository);
    }

    @Test
    void paymentDeclineReturnsPublicErrorCode() {
        CheckoutRequest request = validRequest("SAVE10");

        when(paymentClient.charge(eq("tok_123"), any(BigDecimal.class), eq("cust-123")))
                .thenReturn(new PaymentResult(false));

        CheckoutResponse response = checkoutService.checkout(request);

        assertFalse(response.isSuccess());
        assertEquals("PAYMENT_DECLINED", response.getErrorCode());
        verify(orderRepository, never()).save(any(Order.class));
    }

    private CheckoutRequest validRequest(String couponCode) {
        return new CheckoutRequest(
                "cust-123",
                List.of(new CheckoutItem("SKU-1", 1, new BigDecimal("100.00"))),
                "tok_123",
                couponCode
        );
    }
}
