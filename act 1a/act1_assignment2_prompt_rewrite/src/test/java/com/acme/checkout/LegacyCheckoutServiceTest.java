package com.acme.checkout;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Characterization tests for LegacyCheckoutService.
 *
 * <p>Teaching point: Before refactoring legacy code, tests should capture the
 * current behavior. Claude Code should not remove or weaken these tests to make
 * a refactor easier.</p>
 */
class LegacyCheckoutServiceTest {

    private final PaymentGateway paymentGateway = mock(PaymentGateway.class);
    private final InventoryClient inventoryClient = mock(InventoryClient.class);
    private final CartClient cartClient = mock(CartClient.class);
    private final OrderClient orderClient = mock(OrderClient.class);
    private final AuditLogger auditLogger = mock(AuditLogger.class);

    private final LegacyCheckoutService service = new LegacyCheckoutService(
            paymentGateway,
            inventoryClient,
            cartClient,
            orderClient,
            auditLogger
    );

    /** This test protects authentication behavior. */
    @Test
    void rejectsUnauthenticatedUser() {
        CheckoutResponse response = service.checkout(validRequest(), new UserContext(false, "user-1"));
        assertFalse(response.isSuccess());
        assertEquals("UNAUTHORIZED", response.getErrorCode());
        verifyNoInteractions(paymentGateway);
    }

    /** This test protects the public customer validation contract. */
    @Test
    void rejectsBlankCustomerId() {
        CheckoutRequest request = new CheckoutRequest(" ", "cart-1", "tok_123", validItems());
        CheckoutResponse response = service.checkout(request, new UserContext(true, "user-1"));
        assertFalse(response.isSuccess());
        assertEquals("INVALID_CUSTOMER", response.getErrorCode());
    }

    /** This test protects the payment token validation contract. */
    @Test
    void rejectsBlankPaymentToken() {
        CheckoutRequest request = new CheckoutRequest("cust-1", "cart-1", " ", validItems());
        CheckoutResponse response = service.checkout(request, new UserContext(true, "user-1"));
        assertFalse(response.isSuccess());
        assertEquals("INVALID_PAYMENT", response.getErrorCode());
    }

    /** This test protects quantity validation. */
    @Test
    void rejectsZeroQuantity() {
        CheckoutRequest request = new CheckoutRequest(
                "cust-1",
                "cart-1",
                "tok_123",
                List.of(new CheckoutItem("SKU-1", 0, BigDecimal.TEN))
        );
        CheckoutResponse response = service.checkout(request, new UserContext(true, "user-1"));
        assertFalse(response.isSuccess());
        assertEquals("INVALID_QUANTITY", response.getErrorCode());
    }

    /** This test protects the inventory-before-payment sequence. */
    @Test
    void doesNotChargePaymentWhenInventoryUnavailable() {
        when(cartClient.validateCart("cart-1", "cust-1")).thenReturn(new CartStatus(true));
        when(inventoryClient.checkAvailability("SKU-1", 2)).thenReturn(new InventoryStatus(false));

        CheckoutResponse response = service.checkout(validRequest(), new UserContext(true, "user-1"));

        assertFalse(response.isSuccess());
        assertEquals("INVENTORY_UNAVAILABLE", response.getErrorCode());
        verifyNoInteractions(paymentGateway);
    }

    /** This test protects the happy path behavior. */
    @Test
    void createsOrderWhenCheckoutSucceeds() {
        when(cartClient.validateCart("cart-1", "cust-1")).thenReturn(new CartStatus(true));
        when(inventoryClient.checkAvailability("SKU-1", 2)).thenReturn(new InventoryStatus(true));
        when(paymentGateway.authorizeAndCapture("tok_123", new BigDecimal("20"), "cust-1"))
                .thenReturn(new PaymentResult(true, "pay-1"));
        when(orderClient.createOrder(eq("cust-1"), eq("cart-1"), anyList(), eq(new BigDecimal("20")), eq("pay-1")))
                .thenReturn("order-1");

        CheckoutResponse response = service.checkout(validRequest(), new UserContext(true, "user-1"));

        assertTrue(response.isSuccess());
        assertEquals("order-1", response.getOrderId());
        assertEquals(new BigDecimal("20"), response.getTotal());
    }

    private CheckoutRequest validRequest() {
        return new CheckoutRequest("cust-1", "cart-1", "tok_123", validItems());
    }

    private List<CheckoutItem> validItems() {
        return List.of(new CheckoutItem("SKU-1", 2, BigDecimal.TEN));
    }
}
