package com.acme.checkout;

/**
 * Simplified controller facade.
 *
 * <p>Teaching point: Controllers should coordinate request/response handling,
 * not own checkout business logic. A governed prompt should say that domain
 * logic should not be moved into controllers.</p>
 */
public class CheckoutController {
    private final LegacyCheckoutService checkoutService;

    public CheckoutController(LegacyCheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    /** Delegates checkout work to the service layer. */
    public CheckoutResponse checkout(CheckoutRequest request, UserContext userContext) {
        return checkoutService.checkout(request, userContext);
    }
}
