package com.acme.checkout;

/**
 * HTTP entry point for checkout.
 *
 * <p>Teaching note:
 * A file-level prompt that only mentions {@code CheckoutService.java} may miss
 * that controller-level status mapping is part of the public API behavior.
 */
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    /**
     * Submits checkout and maps domain result into an API response.
     *
     * <p>Architecture rule:
     * The controller should not contain pricing, coupon, or payment logic.
     */
    public ApiResponse<CheckoutResponse> submitCheckout(CheckoutRequest request) {
        CheckoutResponse response = checkoutService.checkout(request);

        if (response.isSuccess()) {
            return ApiResponse.ok(response);
        }

        if ("PAYMENT_DECLINED".equals(response.getErrorCode())) {
            return ApiResponse.status(402, response);
        }

        if ("INVENTORY_UNAVAILABLE".equals(response.getErrorCode())) {
            return ApiResponse.status(409, response);
        }

        return ApiResponse.status(400, response);
    }
}
