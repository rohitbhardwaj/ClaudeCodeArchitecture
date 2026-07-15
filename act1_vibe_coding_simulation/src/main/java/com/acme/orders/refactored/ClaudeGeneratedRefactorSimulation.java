package com.acme.orders.refactored;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

/**
 * Claude-generated refactor used for the Act 1 simulation.
 *
 * <p>This file intentionally contains defects that architects should catch during review.</p>
 *
 * <p>Teaching note: the code looks cleaner in places, but it changes behavior, weakens security,
 * logs sensitive data, and collapses important error contracts.</p>
 */
public class ClaudeGeneratedRefactorSimulation {
    /** This file is a review artifact, not an executable application. */
}

/**
 * Refactored order service generated from the vague prompt:
 *
 * <pre>Clean up the OrderService and add tests.</pre>
 *
 * <p>Review challenge: identify where this refactor changed production behavior.</p>
 */
class OrderService {

    /** Inventory dependency is still injected, which is good. */
    private final InventoryClient inventoryClient;

    /** Payment dependency is still injected, which is good. */
    private final PaymentClient paymentClient;

    /** Repository dependency is still injected, which is good. */
    private final OrderRepository orderRepository;

    /** Audit logger is still injected, but the refactor misuses it by logging payment tokens. */
    private final AuditLogger auditLogger;

    /**
     * New helper added by the refactor.
     *
     * <p>Architecture issue: it is constructed directly instead of being injected, making it harder to configure,
     * mock, replace, or validate independently in a dependency-injection framework.</p>
     */
    private final OrderValidator orderValidator;

    /**
     * Creates the refactored service.
     *
     * <p>Review issue: the new validator is not passed as a dependency. It is hidden inside the constructor.</p>
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
        this.orderValidator = new OrderValidator(); // Architecture drift: direct construction instead of injection.
    }

    /**
     * Places an order using the Claude-generated flow.
     *
     * <p>Major review issue: this method accepts {@code userContext} but never checks it.
     * The original authentication guard is gone.</p>
     *
     * @param request order details supplied by the caller
     * @param userContext user authentication context, now accidentally ignored
     * @return order response with changed error behavior
     */
    public OrderResponse placeOrder(OrderRequest request, UserContext userContext) {
        // Behavior change: validation no longer checks whether userContext is authenticated.
        ValidationResult validation = orderValidator.validate(request);

        // API contract change: many specific error codes are collapsed into BAD_REQUEST.
        if (!validation.isValid()) {
            return OrderResponse.failure("BAD_REQUEST", validation.getMessage());
        }

        // Total calculation was extracted, which can be good, but only if behavior remains identical.
        BigDecimal total = calculateTotal(request);

        // Refactor uses streams for inventory checks.
        boolean available = request.getItems()
                .stream()
                .allMatch(item -> inventoryClient.checkAvailability(
                        item.getSku(),
                        item.getQuantity()
                ).isAvailable());

        // API contract change: OUT_OF_STOCK is replaced by generic BAD_REQUEST.
        if (!available) {
            return OrderResponse.failure(
                    "BAD_REQUEST",
                    "Order cannot be completed."
            );
        }

        // Payment call still happens after inventory, which is good.
        PaymentResult paymentResult = paymentClient.charge(
                request.getPaymentToken(),
                total,
                request.getCustomerId()
        );

        // Security defect: payment token is written to logs on failure.
        if (!paymentResult.isApproved()) {
            auditLogger.warn(
                    "Payment declined for customerId="
                            + request.getCustomerId()
                            + " paymentToken="
                            + request.getPaymentToken()
            );

            // API contract change: PAYMENT_DECLINED becomes PAYMENT_FAILED.
            return OrderResponse.failure(
                    "PAYMENT_FAILED",
                    "Payment failed."
            );
        }

        // Order is still created after payment approval.
        Order order = new Order(
                UUID.randomUUID().toString(),
                request.getCustomerId(),
                request.getItems(),
                total,
                Instant.now()
        );

        // Order is still persisted on success.
        orderRepository.save(order);

        // Security defect: payment token is written to logs on success.
        auditLogger.info(
                "Order placed for customerId="
                        + request.getCustomerId()
                        + " paymentToken="
                        + request.getPaymentToken()
        );

        // Successful response still returns order id and total.
        return OrderResponse.success(order.getOrderId(), total);
    }

    /**
     * Calculates the total for all requested items.
     *
     * <p>This extraction is a reasonable refactoring idea, but it does not compensate for the security
     * and behavior changes elsewhere.</p>
     */
    private BigDecimal calculateTotal(OrderRequest request) {
        return request.getItems()
                .stream()
                .map(item -> item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

/**
 * New validation helper added by Claude.
 *
 * <p>Review challenge: compare each validation rule to the original service.</p>
 */
class OrderValidator {

    /**
     * Validates only the request object.
     *
     * <p>Security issue: validation no longer includes authentication because {@code UserContext} is not passed in.</p>
     */
    public ValidationResult validate(OrderRequest request) {
        // This still rejects missing request, but message and error code behavior changed upstream.
        if (request == null) {
            return ValidationResult.invalid("Order request is missing.");
        }

        // Behavior change: blank customer id is now accepted because only null is checked.
        if (request.getCustomerId() == null) {
            return ValidationResult.invalid("Customer is missing.");
        }

        // Empty item list is still rejected.
        if (request.getItems() == null || request.getItems().isEmpty()) {
            return ValidationResult.invalid("No order items found.");
        }

        // Behavior change: blank payment token is now accepted because only null is checked.
        if (request.getPaymentToken() == null) {
            return ValidationResult.invalid("Payment is missing.");
        }

        // Validate each item.
        for (OrderItem item : request.getItems()) {
            // Behavior change: blank SKU is now accepted because only null is checked.
            if (item.getSku() == null) {
                return ValidationResult.invalid("Item is invalid.");
            }

            // Behavior change: zero quantity is now accepted because only negative quantity is rejected.
            if (item.getQuantity() < 0) {
                return ValidationResult.invalid("Item quantity is invalid.");
            }
        }

        // If validation did not fail, the request is considered valid.
        return ValidationResult.valid();
    }
}

/** Validation result object used by the new helper. */
class ValidationResult {
    /** True when validation succeeds. */
    private final boolean valid;
    /** Validation failure message. */
    private final String message;

    /** Creates a validation result. */
    private ValidationResult(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    /** Returns a successful validation result. */
    public static ValidationResult valid() { return new ValidationResult(true, null); }

    /** Returns a failed validation result. */
    public static ValidationResult invalid(String message) { return new ValidationResult(false, message); }

    /** Returns true when validation succeeded. */
    public boolean isValid() { return valid; }

    /** Returns the validation message. */
    public String getMessage() { return message; }
}

/** Request object representing the caller's desired order. */
class OrderRequest {
    private final String customerId;
    private final List<OrderItem> items;
    private final String paymentToken;

    /** Creates an order request. */
    public OrderRequest(String customerId, List<OrderItem> items, String paymentToken) {
        this.customerId = customerId;
        this.items = items;
        this.paymentToken = paymentToken;
    }

    /** Returns customer id. */
    public String getCustomerId() { return customerId; }
    /** Returns items. */
    public List<OrderItem> getItems() { return items; }
    /** Returns payment token, which should never be logged. */
    public String getPaymentToken() { return paymentToken; }
}

/** Order line item. */
class OrderItem {
    private final String sku;
    private final int quantity;
    private final BigDecimal unitPrice;

    /** Creates an order item. */
    public OrderItem(String sku, int quantity, BigDecimal unitPrice) {
        this.sku = sku;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    /** Returns SKU. */
    public String getSku() { return sku; }
    /** Returns quantity. */
    public int getQuantity() { return quantity; }
    /** Returns unit price. */
    public BigDecimal getUnitPrice() { return unitPrice; }
}

/** Order API response. */
class OrderResponse {
    private final boolean success;
    private final String orderId;
    private final BigDecimal total;
    private final String errorCode;
    private final String message;

    /** Creates response. */
    private OrderResponse(boolean success, String orderId, BigDecimal total, String errorCode, String message) {
        this.success = success;
        this.orderId = orderId;
        this.total = total;
        this.errorCode = errorCode;
        this.message = message;
    }

    /** Creates success response. */
    public static OrderResponse success(String orderId, BigDecimal total) {
        return new OrderResponse(true, orderId, total, null, null);
    }

    /** Creates failure response. */
    public static OrderResponse failure(String errorCode, String message) {
        return new OrderResponse(false, null, null, errorCode, message);
    }

    /** Returns success flag. */
    public boolean isSuccess() { return success; }
    /** Returns order id. */
    public String getOrderId() { return orderId; }
    /** Returns total. */
    public BigDecimal getTotal() { return total; }
    /** Returns error code. */
    public String getErrorCode() { return errorCode; }
    /** Returns message. */
    public String getMessage() { return message; }
}

/** Persisted order entity. */
class Order {
    private final String orderId;
    private final String customerId;
    private final List<OrderItem> items;
    private final BigDecimal total;
    private final Instant createdAt;

    /** Creates order entity. */
    public Order(String orderId, String customerId, List<OrderItem> items, BigDecimal total, Instant createdAt) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = items;
        this.total = total;
        this.createdAt = createdAt;
    }

    /** Returns order id. */
    public String getOrderId() { return orderId; }
    /** Returns customer id. */
    public String getCustomerId() { return customerId; }
    /** Returns items. */
    public List<OrderItem> getItems() { return items; }
    /** Returns total. */
    public BigDecimal getTotal() { return total; }
    /** Returns creation timestamp. */
    public Instant getCreatedAt() { return createdAt; }
}

/** User authentication context; accidentally ignored by refactored service. */
class UserContext {
    private final boolean authenticated;
    private final String userId;

    /** Creates user context. */
    public UserContext(boolean authenticated, String userId) {
        this.authenticated = authenticated;
        this.userId = userId;
    }

    /** Returns authentication flag. */
    public boolean isAuthenticated() { return authenticated; }
    /** Returns user id. */
    public String getUserId() { return userId; }
}

/** Inventory dependency. */
interface InventoryClient { InventoryStatus checkAvailability(String sku, int quantity); }

/** Inventory result. */
class InventoryStatus {
    private final boolean available;
    /** Creates inventory status. */
    public InventoryStatus(boolean available) { this.available = available; }
    /** Returns availability. */
    public boolean isAvailable() { return available; }
}

/** Payment dependency. */
interface PaymentClient { PaymentResult charge(String paymentToken, BigDecimal amount, String customerId); }

/** Payment result. */
class PaymentResult {
    private final boolean approved;
    /** Creates payment result. */
    public PaymentResult(boolean approved) { this.approved = approved; }
    /** Returns approval flag. */
    public boolean isApproved() { return approved; }
}

/** Order repository. */
interface OrderRepository { void save(Order order); }

/** Audit logger. */
interface AuditLogger {
    /** Logs info-level audit event. */
    void info(String message);
    /** Logs warning-level audit event. */
    void warn(String message);
}
