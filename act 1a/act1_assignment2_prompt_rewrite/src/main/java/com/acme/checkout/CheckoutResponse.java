package com.acme.checkout;

import java.math.BigDecimal;

/**
 * Response returned by the checkout API.
 *
 * <p>Teaching point: Error codes are public behavior. Even if a generic error
 * response looks cleaner, changing error codes can break clients, support tools,
 * dashboards, and tests.</p>
 */
public class CheckoutResponse {
    private final boolean success;
    private final String orderId;
    private final BigDecimal total;
    private final String errorCode;
    private final String message;

    private CheckoutResponse(boolean success, String orderId, BigDecimal total, String errorCode, String message) {
        this.success = success;
        this.orderId = orderId;
        this.total = total;
        this.errorCode = errorCode;
        this.message = message;
    }

    /** Creates a successful checkout response. */
    public static CheckoutResponse success(String orderId, BigDecimal total) {
        return new CheckoutResponse(true, orderId, total, null, null);
    }

    /** Creates a failed checkout response with a stable public error code. */
    public static CheckoutResponse failure(String errorCode, String message) {
        return new CheckoutResponse(false, null, null, errorCode, message);
    }

    public boolean isSuccess() { return success; }
    public String getOrderId() { return orderId; }
    public BigDecimal getTotal() { return total; }
    public String getErrorCode() { return errorCode; }
    public String getMessage() { return message; }
}
