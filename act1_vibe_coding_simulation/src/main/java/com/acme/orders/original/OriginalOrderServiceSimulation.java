package com.acme.orders.original;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

/**
 * Original production-style implementation used for the Act 1 simulation.
 *
 * <p>This file intentionally keeps multiple small domain classes in one source file so
 * workshop participants can read the complete example without jumping between files.</p>
 *
 * <p>Architecture lesson: this class is not perfect. It has room for refactoring.
 * However, it has important production behavior that a refactor must preserve:</p>
 *
 * <ul>
 *   <li>Authentication is checked before order processing.</li>
 *   <li>Validation returns specific error codes.</li>
 *   <li>Payment tokens are not written to logs.</li>
 *   <li>Inventory failure returns a domain-specific error.</li>
 *   <li>Payment failure returns a stable error contract.</li>
 * </ul>
 */
public class OriginalOrderServiceSimulation {
    /**
     * Demo entry point is intentionally omitted.
     *
     * <p>This source file is meant to be reviewed, not executed directly.</p>
     */
}

/**
 * Coordinates order placement across validation, inventory, payment, persistence, and audit logging.
 *
 * <p>Teaching note: this service has multiple responsibilities, so it is a realistic refactoring candidate.
 * But refactoring must preserve public behavior and security controls.</p>
 */
class OrderService {

    /** External dependency used to verify whether each requested SKU can be fulfilled. */
    private final InventoryClient inventoryClient;

    /** External dependency used to charge the customer after inventory has been confirmed. */
    private final PaymentClient paymentClient;

    /** Persistence dependency used to save successful orders. */
    private final OrderRepository orderRepository;

    /** Logging dependency used for audit-relevant events without exposing secrets. */
    private final AuditLogger auditLogger;

    /**
     * Creates the service with all external dependencies injected.
     *
     * <p>Architecture note: dependency injection makes collaborators replaceable in tests and configurable in production.</p>
     */
    public OrderService(
            InventoryClient inventoryClient,
            PaymentClient paymentClient,
            OrderRepository orderRepository,
            AuditLogger auditLogger
    ) {
        this.inventoryClient = inventoryClient;
        this.paymentClient = paymentClient;
        this.orderRepository = orderRepository;
        this.auditLogger = auditLogger;
    }

    /**
     * Places an order if the user is authenticated, the request is valid, inventory is available, and payment succeeds.
     *
     * <p>Important contract: callers may depend on the exact error codes returned from this method.
     * A refactor should not collapse or rename those codes unless the API contract is intentionally changed.</p>
     *
     * @param request order details supplied by the caller
     * @param userContext authentication context for the current user
     * @return success response with order id and total, or failure response with stable error code
     */
    public OrderResponse placeOrder(OrderRequest request, UserContext userContext) {
        // Security gate: unauthenticated users must not be allowed to place orders.
        if (userContext == null || !userContext.isAuthenticated()) {
            return OrderResponse.failure("UNAUTHORIZED", "User is not authorized to place orders.");
        }

        // Validation gate: a missing request is a specific client error.
        if (request == null) {
            return OrderResponse.failure("INVALID_ORDER", "Order request is required.");
        }

        // Validation gate: blank customer ids are rejected, not only null customer ids.
        if (request.getCustomerId() == null || request.getCustomerId().isBlank()) {
            return OrderResponse.failure("INVALID_CUSTOMER", "Customer id is required.");
        }

        // Validation gate: an order without items is not processable.
        if (request.getItems() == null || request.getItems().isEmpty()) {
            return OrderResponse.failure("EMPTY_ORDER", "Order must contain at least one item.");
        }

        // Validation gate: blank payment tokens are rejected, not only null payment tokens.
        if (request.getPaymentToken() == null || request.getPaymentToken().isBlank()) {
            return OrderResponse.failure("INVALID_PAYMENT", "Payment token is required.");
        }

        // Running total starts at zero and accumulates item price multiplied by quantity.
        BigDecimal total = BigDecimal.ZERO;

        // Validate and price each item before charging the customer.
        for (OrderItem item : request.getItems()) {
            // Validation gate: SKU is required and cannot be blank.
            if (item.getSku() == null || item.getSku().isBlank()) {
                return OrderResponse.failure("INVALID_ITEM", "Item SKU is required.");
            }

            // Validation gate: quantity must be positive; zero quantity is invalid.
            if (item.getQuantity() <= 0) {
                return OrderResponse.failure("INVALID_QUANTITY", "Item quantity must be greater than zero.");
            }

            // External call: verify inventory before attempting payment.
            InventoryStatus inventory = inventoryClient.checkAvailability(
                    item.getSku(),
                    item.getQuantity()
            );

            // Domain-specific error: clients can distinguish out-of-stock from generic bad requests.
            if (!inventory.isAvailable()) {
                return OrderResponse.failure(
                        "OUT_OF_STOCK",
                        "Item " + item.getSku() + " is not available."
                );
            }

            // Add item subtotal to the order total.
            total = total.add(item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        // External call: charge only after request and inventory validation succeed.
        PaymentResult paymentResult = paymentClient.charge(
                request.getPaymentToken(),
                total,
                request.getCustomerId()
        );

        // Payment failure path: log customer id, but do not log the payment token.
        if (!paymentResult.isApproved()) {
            auditLogger.warn(
                    "Payment declined for customerId=" + request.getCustomerId()
            );

            return OrderResponse.failure(
                    "PAYMENT_DECLINED",
                    "Payment was declined."
            );
        }

        // Create a persisted order only after successful payment.
        Order order = new Order(
                UUID.randomUUID().toString(),
                request.getCustomerId(),
                request.getItems(),
                total,
                Instant.now()
        );

        // Persist the successful order.
        orderRepository.save(order);

        // Success audit event: safe logging includes order id and customer id, not payment token.
        auditLogger.info(
                "Order placed orderId=" + order.getOrderId()
                        + " customerId=" + request.getCustomerId()
        );

        // Return successful order response.
        return OrderResponse.success(order.getOrderId(), total);
    }
}

/** Request object representing the caller's desired order. */
class OrderRequest {
    /** Customer identifier associated with the order. */
    private final String customerId;
    /** Items requested for purchase. */
    private final List<OrderItem> items;
    /** Tokenized payment credential. This must never be logged. */
    private final String paymentToken;

    /** Creates an order request with customer, items, and payment token. */
    public OrderRequest(String customerId, List<OrderItem> items, String paymentToken) {
        this.customerId = customerId;
        this.items = items;
        this.paymentToken = paymentToken;
    }

    /** Returns the customer id supplied by the caller. */
    public String getCustomerId() { return customerId; }

    /** Returns the requested order items. */
    public List<OrderItem> getItems() { return items; }

    /** Returns the tokenized payment credential. */
    public String getPaymentToken() { return paymentToken; }
}

/** Single line item in an order request. */
class OrderItem {
    /** Stock keeping unit used for inventory lookup. */
    private final String sku;
    /** Quantity requested; must be greater than zero. */
    private final int quantity;
    /** Unit price used to calculate the order total. */
    private final BigDecimal unitPrice;

    /** Creates one order item. */
    public OrderItem(String sku, int quantity, BigDecimal unitPrice) {
        this.sku = sku;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    /** Returns the item SKU. */
    public String getSku() { return sku; }

    /** Returns the requested quantity. */
    public int getQuantity() { return quantity; }

    /** Returns the item unit price. */
    public BigDecimal getUnitPrice() { return unitPrice; }
}

/** API response returned from order placement. */
class OrderResponse {
    /** Indicates whether the operation succeeded. */
    private final boolean success;
    /** Order id exists only when success is true. */
    private final String orderId;
    /** Total exists only when success is true. */
    private final BigDecimal total;
    /** Error code exists only when success is false. */
    private final String errorCode;
    /** Human-readable message exists only when success is false. */
    private final String message;

    /** Private constructor forces callers to use success or failure factory methods. */
    private OrderResponse(boolean success, String orderId, BigDecimal total, String errorCode, String message) {
        this.success = success;
        this.orderId = orderId;
        this.total = total;
        this.errorCode = errorCode;
        this.message = message;
    }

    /** Creates a successful response. */
    public static OrderResponse success(String orderId, BigDecimal total) {
        return new OrderResponse(true, orderId, total, null, null);
    }

    /** Creates a failed response with a stable error code. */
    public static OrderResponse failure(String errorCode, String message) {
        return new OrderResponse(false, null, null, errorCode, message);
    }

    /** Returns true when the order was placed. */
    public boolean isSuccess() { return success; }
    /** Returns the new order id for successful responses. */
    public String getOrderId() { return orderId; }
    /** Returns the order total for successful responses. */
    public BigDecimal getTotal() { return total; }
    /** Returns the stable error code for failed responses. */
    public String getErrorCode() { return errorCode; }
    /** Returns the human-readable failure message. */
    public String getMessage() { return message; }
}

/** Persisted order entity. */
class Order {
    private final String orderId;
    private final String customerId;
    private final List<OrderItem> items;
    private final BigDecimal total;
    private final Instant createdAt;

    /** Creates the persisted order representation. */
    public Order(String orderId, String customerId, List<OrderItem> items, BigDecimal total, Instant createdAt) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = items;
        this.total = total;
        this.createdAt = createdAt;
    }

    /** Returns the generated order id. */
    public String getOrderId() { return orderId; }
    /** Returns the customer id. */
    public String getCustomerId() { return customerId; }
    /** Returns the persisted order items. */
    public List<OrderItem> getItems() { return items; }
    /** Returns the calculated order total. */
    public BigDecimal getTotal() { return total; }
    /** Returns the creation timestamp. */
    public Instant getCreatedAt() { return createdAt; }
}

/** User authentication context. */
class UserContext {
    private final boolean authenticated;
    private final String userId;

    /** Creates a user context. */
    public UserContext(boolean authenticated, String userId) {
        this.authenticated = authenticated;
        this.userId = userId;
    }

    /** Returns true when the current user is authenticated. */
    public boolean isAuthenticated() { return authenticated; }
    /** Returns the current user id. */
    public String getUserId() { return userId; }
}

/** External inventory dependency. */
interface InventoryClient { InventoryStatus checkAvailability(String sku, int quantity); }

/** Inventory lookup result. */
class InventoryStatus {
    private final boolean available;
    /** Creates inventory status. */
    public InventoryStatus(boolean available) { this.available = available; }
    /** Returns true when inventory is available. */
    public boolean isAvailable() { return available; }
}

/** External payment dependency. */
interface PaymentClient { PaymentResult charge(String paymentToken, BigDecimal amount, String customerId); }

/** Payment authorization result. */
class PaymentResult {
    private final boolean approved;
    /** Creates payment result. */
    public PaymentResult(boolean approved) { this.approved = approved; }
    /** Returns true when payment is approved. */
    public boolean isApproved() { return approved; }
}

/** Persistence dependency for orders. */
interface OrderRepository { void save(Order order); }

/** Audit logging dependency. */
interface AuditLogger {
    /** Records informational audit events. */
    void info(String message);
    /** Records warning audit events. */
    void warn(String message);
}
