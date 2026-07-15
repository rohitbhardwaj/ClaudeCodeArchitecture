package com.acme.checkout;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Claude-updated tests for the discount feature.
 *
 * <p>Teaching purpose:
 * These tests pass, but they are weak.
 *
 * <p>Participants should notice:
 *
 * <ul>
 *   <li>Only the happy path is tested.</li>
 *   <li>No invalid or expired discount tests exist.</li>
 *   <li>No authorization or eligibility tests exist.</li>
 *   <li>No refund behavior is tested.</li>
 *   <li>No audit logging expectations exist.</li>
 *   <li>No feature flag test exists.</li>
 *   <li>No API compatibility checks exist.</li>
 * </ul>
 */
class CheckoutServiceTest {

    private final PaymentClient paymentClient = mock(PaymentClient.class);
    private final OrderRepository orderRepository = mock(OrderRepository.class);
    private final AuditLogger auditLogger = mock(AuditLogger.class);

    private final CheckoutService checkoutService = new CheckoutService(
            paymentClient,
            orderRepository,
            auditLogger
    );

    /**
     * Happy-path test only.
     *
     * <p>Risk:
     * This proves the discount math works for one valid input.
     * It does not prove the feature is safe for production.
     */
    @Test
    void appliesSave10Discount() {
        CheckoutRequest request = new CheckoutRequest(
                "cust-123",
                List.of(new CheckoutItem("SKU-1", 2, new BigDecimal("50.00"))),
                "tok_123",
                "SAVE10"
        );

        when(paymentClient.charge(eq("tok_123"), any(BigDecimal.class), eq("cust-123")))
                .thenReturn(new PaymentResult(true));

        Receipt receipt = checkoutService.checkout(request);

        assertEquals(new BigDecimal("100.00"), receipt.getSubtotal());
        assertEquals(new BigDecimal("10.0000"), receipt.getDiscountAmount());
        assertEquals(new BigDecimal("5.63"), receipt.getTax());
        assertEquals(new BigDecimal("95.6300"), receipt.getTotal());

        verify(orderRepository).save(any(Order.class));
    }
}
