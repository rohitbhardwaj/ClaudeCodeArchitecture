package com.acme.orders.refactored;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Claude-updated tests after the vague refactor prompt.
 *
 * <p>Teaching note: these tests pass, but they no longer protect several important production behaviors.</p>
 */
class ClaudeGeneratedOrderServiceTest {

    /** Mock inventory dependency. */
    private final InventoryClient inventoryClient = mock(InventoryClient.class);

    /** Mock payment dependency. */
    private final PaymentClient paymentClient = mock(PaymentClient.class);

    /** Mock repository dependency. */
    private final OrderRepository orderRepository = mock(OrderRepository.class);

    /** Mock audit logger dependency. */
    private final AuditLogger auditLogger = mock(AuditLogger.class);

    /** Refactored service under test. */
    private final OrderService orderService = new OrderService(
            inventoryClient,
            paymentClient,
            orderRepository,
            auditLogger
    );

    /**
     * New test added by Claude.
     *
     * <p>This test is useful, but it does not replace the deleted authentication test.</p>
     */
    @Test
    void rejectsMissingOrderRequest() {
        OrderResponse response = orderService.placeOrder(
                null,
                new UserContext(true, "user-123")
        );

        assertFalse(response.isSuccess());
        assertEquals("BAD_REQUEST", response.getErrorCode());
    }

    /**
     * New test added by Claude.
     *
     * <p>This test accepts the new generic BAD_REQUEST code instead of preserving more specific error contracts.</p>
     */
    @Test
    void rejectsEmptyItems() {
        OrderRequest request = new OrderRequest(
                "cust-123",
                List.of(),
                "tok_123"
        );

        OrderResponse response = orderService.placeOrder(
                request,
                new UserContext(true, "user-123")
        );

        assertFalse(response.isSuccess());
        assertEquals("BAD_REQUEST", response.getErrorCode());
    }

    /**
     * Happy-path test still passes.
     *
     * <p>Review issue: a passing happy path does not prove authentication, validation, logging, or error contracts are safe.</p>
     */
    @Test
    void placesOrderSuccessfully() {
        OrderRequest request = validRequest();

        when(inventoryClient.checkAvailability("SKU-1", 2))
                .thenReturn(new InventoryStatus(true));

        when(paymentClient.charge("tok_123", new BigDecimal("20"), "cust-123"))
                .thenReturn(new PaymentResult(true));

        OrderResponse response = orderService.placeOrder(
                request,
                new UserContext(true, "user-123")
        );

        assertTrue(response.isSuccess());
        assertEquals(new BigDecimal("20"), response.getTotal());

        verify(orderRepository).save(any(Order.class));
    }

    /**
     * Builds a valid request for the happy path.
     *
     * <p>Missing tests: unauthenticated user, blank customer id, zero quantity, out-of-stock, and secret logging.</p>
     */
    private OrderRequest validRequest() {
        return new OrderRequest(
                "cust-123",
                List.of(new OrderItem("SKU-1", 2, BigDecimal.TEN)),
                "tok_123"
        );
    }
}
