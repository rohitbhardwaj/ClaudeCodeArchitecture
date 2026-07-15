package com.acme.checkout;

/**
 * Simple API response wrapper used by the simulation.
 */
public class ApiResponse<T> {

    private final int statusCode;
    private final T body;

    private ApiResponse(int statusCode, T body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    public static <T> ApiResponse<T> ok(T body) {
        return new ApiResponse<>(200, body);
    }

    public static <T> ApiResponse<T> status(int statusCode, T body) {
        return new ApiResponse<>(statusCode, body);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public T getBody() {
        return body;
    }
}
