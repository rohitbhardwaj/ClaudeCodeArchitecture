package com.acme.checkout.support;

/**
 * Support impact:
 * Support needs clear rejection reason codes.
 */
public class SupportReasonMapper {
    public String messageFor(String reasonCode) {
        return switch (reasonCode) {
            case "EXPIRED" -> "This promotion has expired.";
            case "UNAUTHORIZED" -> "This promotion is not available for this account.";
            case "INVALID" -> "This promotion code is not valid.";
            default -> "Promotion could not be applied.";
        };
    }
}
