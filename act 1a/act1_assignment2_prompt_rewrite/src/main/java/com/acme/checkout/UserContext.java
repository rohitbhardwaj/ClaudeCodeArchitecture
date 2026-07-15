package com.acme.checkout;

/** Represents the authenticated user calling the checkout API. */
public class UserContext {
    private final boolean authenticated;
    private final String userId;

    /**
     * @param authenticated whether the user is authenticated
     * @param userId user identifier used for traceability
     */
    public UserContext(boolean authenticated, String userId) {
        this.authenticated = authenticated;
        this.userId = userId;
    }

    public boolean isAuthenticated() { return authenticated; }
    public String getUserId() { return userId; }
}
