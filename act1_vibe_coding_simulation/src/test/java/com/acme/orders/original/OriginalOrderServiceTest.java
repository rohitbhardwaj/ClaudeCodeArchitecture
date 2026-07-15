package com.acme.orders.original;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Original regression tests that protect important production behavior.
 *
 * <p>Teaching note: these tests are not just checking code. They are protecting the system contract.</p>
 */
class OriginalOrderServiceTest {

    /** Mock inventory dependency to avoid calling a real inventory system during unit tests. */
    private final InventoryClient inventoryClient = mock(InventoryClient.class);

    /** Mock payment dependency to avoid making real charges during unit tests. */
    private final PaymentClient paymentClient = mock(PaymentClient.class);

    /** Mock repository to verify persistence behavior without writing to a database. */
    private final OrderRepository orderRepository = mock(OrderRepository.class);

    /** Mock audit logger to verify behavior without writing real logs. */
    private final AuditLogger auditLogger = mock(AuditLogger.class);

    /** Service under test using mocked collaborators. */
    private final OrderService orderService = new OrderService(
            inventoryClient,
            paymentClient,
            orderRepository,
            auditLogger
    );

    /**
     * Protects the authentication contract.
     *
     * <p>If this test is removed, a refactor can accidentally allow unauthenticated orders.</p>
     */
    @Test
    void rejectsUnauthenticatedUser() {
        OrderRequest request = validRequest();

        OrderResponse response = orderService.placeOrder(
                request,
                new UserContext(false, "user-123")
        );

        assertFalse(response.isSuccess());
        assertEquals("UNAUTHORIZED", response.getErrorCode());

        verifyNoInteractions(paymentClient);
        verifyNoInteractions(orderRepository);
    }

    /**
     * Protects customer-id validation.
     *
     * <p>Blank customer ids should be rejected, not treated as valid customers.</p>
     */
    @Test
    void rejectsBlankCustomerId() {
        OrderRequest request = new OrderRequest(
                " ",
                List.of(new OrderItem("SKU-1", 1, BigDecimal.TEN)),
                "tok_123"
        );

        OrderResponse response = orderService.placeOrder(
                request,
                new UserContext(true, "user-123")
        );

        assertFalse(response.isSuccess());
        assertEquals("INVALID_CUSTOMER", response.getErrorCode());

        verifyNoInteractions(paymentClient);
        verifyNoInteractions(orderRepository);
    }

    /**
     * Protects quantity validation.
     *
     * <p>Zero quantity is invalid because it can create nonsensical orders and downstream accounting issues.</p>
     */
    @Test
    void rejectsZeroQuantity() {
        OrderRequest request = new OrderRequest(
                "cust-123",
                List.of(new OrderItem("SKU-1", 0, BigDecimal.TEN)),
                "tok_123"
        );

        OrderResponse response = orderService.placeOrder(
                request,
                new UserContext(true, "user-123")
        );

        assertFalse(response.isSuccess());
        assertEquals("INVALID_QUANTITY", response.getErrorCode());

        verifyNoInteractions(paymentClient);
        verifyNoInteractions(orderRepository);
    }

    /**
     * Protects inventory-specific behavior.
     *
     * <p>The out-of-stock error code is part of the public behavior clients may depend on.</p>
     */
    @Test
    void returnsOutOfStockWhenInventoryUnavailable() {
        OrderRequest request = validRequest();

        when(inventoryClient.checkAvailability("SKU-1", 2))
                .thenReturn(new InventoryStatus(false));

        OrderResponse response = orderService.placeOrder(
                request,
                new UserContext(true, "user-123")
        );

        assertFalse(response.isSuccess());
        assertEquals("OUT_OF_STOCK", response.getErrorCode());

        verifyNoInteractions(paymentClient);
        verifyNoInteractions(orderRepository);
    }

    /**
     * Protects the happy path.
     *
     * <p>Successful orders should calculate total, charge payment, and save the order.</p>
     */
    @Test
    void placesOrderWhenInventoryAndPaymentSucceed() {
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

    /** Builds a valid request used by tests that do not focus on request validation. */
    private OrderRequest validRequest() {
        return new OrderRequest(
                "cust-123",
                List.of(new OrderItem("SKU-1", 2, BigDecimal.TEN)),
                "tok_123"
        );
    }
}
