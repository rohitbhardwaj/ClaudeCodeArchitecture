package com.acme.checkout;

import java.math.BigDecimal;
import java.util.List;

/**
 * LegacyCheckoutService is intentionally written as a realistic legacy service.
 *
 * <p>This class is used for Act 1 Assignment 2: Before/After Prompt Rewrite.
 * The goal is not to immediately refactor this class. The goal is to help
 * architects notice why a vague prompt such as "Improve this checkout code and
 * make it production ready" gives Claude Code too much authority.</p>
 *
 * <p>Teaching idea: Every public behavior, validation rule, dependency boundary,
 * and log statement should be treated as something Claude Code must first
 * understand before modifying code.</p>
 */
public class LegacyCheckoutService {

    /**
     * Payment boundary.
     *
     * <p>Claude Code should not move payment logic out of this boundary without
     * explicit architect approval. Payment behavior is usually high risk because
     * it affects money movement, refunds, reconciliation, fraud controls, and
     * customer trust.</p>
     */
    private final PaymentGateway paymentGateway;

    /**
     * Inventory boundary.
     *
     * <p>Inventory checks must happen before payment capture. A refactor that
     * changes this sequence may charge customers for items that cannot be
     * fulfilled.</p>
     */
    private final InventoryClient inventoryClient;

    /**
     * Cart boundary.
     *
     * <p>The checkout service should not silently take over cart ownership. It
     * should use the cart client for cart-related decisions.</p>
     */
    private final CartClient cartClient;

    /**
     * Order boundary.
     *
     * <p>Order creation is delegated to OrderClient. If Claude Code moves order
     * creation into this service, that is an architecture boundary change.</p>
     */
    private final OrderClient orderClient;

    /**
     * Audit logging boundary.
     *
     * <p>Logs are useful for operations and support, but logs must not expose
     * secrets, payment tokens, or sensitive customer data.</p>
     */
    private final AuditLogger auditLogger;

    /**
     * Creates the legacy checkout service with all external collaborators.
     *
     * @param paymentGateway external payment integration
     * @param inventoryClient inventory availability integration
     * @param cartClient cart validation integration
     * @param orderClient order creation integration
     * @param auditLogger operational audit logger
     */
    public LegacyCheckoutService(
            PaymentGateway paymentGateway,
            InventoryClient inventoryClient,
            CartClient cartClient,
            OrderClient orderClient,
            AuditLogger auditLogger
    ) {
        this.paymentGateway = paymentGateway;
        this.inventoryClient = inventoryClient;
        this.cartClient = cartClient;
        this.orderClient = orderClient;
        this.auditLogger = auditLogger;
    }

    /**
     * Performs checkout for a user.
     *
     * <p>Important teaching point: This method has several responsibilities. A
     * future refactor may be justified, but the refactor must preserve public
     * behavior unless the architect explicitly approves behavior changes.</p>
     *
     * <p>Current behavior that must be preserved:</p>
     * <ul>
     *     <li>Unauthenticated users receive {@code UNAUTHORIZED}.</li>
     *     <li>Missing request receives {@code INVALID_CHECKOUT_REQUEST}.</li>
     *     <li>Blank customer id receives {@code INVALID_CUSTOMER}.</li>
     *     <li>Blank cart id receives {@code INVALID_CART}.</li>
     *     <li>Blank payment token receives {@code INVALID_PAYMENT}.</li>
     *     <li>Empty items receive {@code EMPTY_CART}.</li>
     *     <li>Invalid item SKU receives {@code INVALID_ITEM}.</li>
     *     <li>Quantity less than or equal to zero receives {@code INVALID_QUANTITY}.</li>
     *     <li>Unavailable inventory receives {@code INVENTORY_UNAVAILABLE}.</li>
     *     <li>Declined payment receives {@code PAYMENT_DECLINED}.</li>
     * </ul>
     *
     * @param request checkout request submitted by the client
     * @param userContext authenticated user context
     * @return checkout response with either an order id or a stable error code
     */
    public CheckoutResponse checkout(CheckoutRequest request, UserContext userContext) {
        // SECURITY-SENSITIVE: Authentication must happen before any checkout work.
        // A vague prompt might cause Claude to move, remove, or simplify this check.
        if (userContext == null || !userContext.isAuthenticated()) {
            return CheckoutResponse.failure(
                    "UNAUTHORIZED",
                    "User is not authorized to checkout."
            );
        }

        // PUBLIC API BEHAVIOR: This specific error code may be used by clients,
        // dashboards, alerting rules, and customer support tooling.
        if (request == null) {
            return CheckoutResponse.failure(
                    "INVALID_CHECKOUT_REQUEST",
                    "Checkout request is required."
            );
        }

        // VALIDATION RULE: Blank customer id is invalid, not only null.
        // A refactor must preserve this rule.
        if (request.getCustomerId() == null || request.getCustomerId().isBlank()) {
            return CheckoutResponse.failure(
                    "INVALID_CUSTOMER",
                    "Customer id is required."
            );
        }

        // VALIDATION RULE: Cart id is part of the external API contract.
        if (request.getCartId() == null || request.getCartId().isBlank()) {
            return CheckoutResponse.failure(
                    "INVALID_CART",
                    "Cart id is required."
            );
        }

        // SECURITY-SENSITIVE: Payment token is required, but must never be logged.
        if (request.getPaymentToken() == null || request.getPaymentToken().isBlank()) {
            return CheckoutResponse.failure(
                    "INVALID_PAYMENT",
                    "Payment token is required."
            );
        }

        // BUSINESS RULE: Checkout requires at least one item.
        List<CheckoutItem> items = request.getItems();
        if (items == null || items.isEmpty()) {
            return CheckoutResponse.failure(
                    "EMPTY_CART",
                    "Checkout requires at least one item."
            );
        }

        // BOUNDARY RULE: Cart ownership remains with CartClient.
        // Claude should not bypass or duplicate this behavior without approval.
        CartStatus cartStatus = cartClient.validateCart(
                request.getCartId(),
                request.getCustomerId()
        );
        if (!cartStatus.isValid()) {
            return CheckoutResponse.failure(
                    "INVALID_CART",
                    "Cart is not valid for this customer."
            );
        }

        BigDecimal total = BigDecimal.ZERO;

        // RESPONSIBILITY MIX: This loop handles validation, inventory, and pricing.
        // It is a legitimate refactoring candidate, but behavior must be captured
        // with characterization tests before any extraction.
        for (CheckoutItem item : items) {
            if (item.getSku() == null || item.getSku().isBlank()) {
                return CheckoutResponse.failure(
                        "INVALID_ITEM",
                        "Item SKU is required."
                );
            }

            if (item.getQuantity() <= 0) {
                return CheckoutResponse.failure(
                        "INVALID_QUANTITY",
                        "Item quantity must be greater than zero."
                );
            }

            if (item.getUnitPrice() == null || item.getUnitPrice().compareTo(BigDecimal.ZERO) < 0) {
                return CheckoutResponse.failure(
                        "INVALID_PRICE",
                        "Item price cannot be negative."
                );
            }

            // SEQUENCE-SENSITIVE: Inventory is checked before payment.
            InventoryStatus inventoryStatus = inventoryClient.checkAvailability(
                    item.getSku(),
                    item.getQuantity()
            );

            if (!inventoryStatus.isAvailable()) {
                return CheckoutResponse.failure(
                        "INVENTORY_UNAVAILABLE",
                        "Item " + item.getSku() + " is not available."
                );
            }

            total = total.add(item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        // PAYMENT BOUNDARY: Keep payment calls behind PaymentGateway.
        PaymentResult paymentResult = paymentGateway.authorizeAndCapture(
                request.getPaymentToken(),
                total,
                request.getCustomerId()
        );

        if (!paymentResult.isApproved()) {
            // SECURITY NOTE: This log includes customer id but intentionally does
            // not include the payment token.
            auditLogger.warn("Payment declined for customerId=" + request.getCustomerId());
            return CheckoutResponse.failure(
                    "PAYMENT_DECLINED",
                    "Payment was declined."
            );
        }

        // ORDER BOUNDARY: Keep order creation delegated to OrderClient.
        String orderId = orderClient.createOrder(
                request.getCustomerId(),
                request.getCartId(),
                items,
                total,
                paymentResult.getPaymentId()
        );

        auditLogger.info("Checkout completed orderId=" + orderId + " customerId=" + request.getCustomerId());

        return CheckoutResponse.success(orderId, total);
    }
}
