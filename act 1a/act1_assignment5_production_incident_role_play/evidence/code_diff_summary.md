# Code Diff Summary

This is a simplified summary of the simulated code changes.

## CouponValidator.java

Before:

```text
- Coupons matched case-insensitively.
- Campaign fallback checked active campaign list.
- Rejection reason codes were specific:
  - COUPON_EXPIRED
  - COUPON_NOT_ELIGIBLE
  - COUPON_NOT_FOUND
  - COUPON_ALREADY_USED
```

After:

```text
- Coupons are normalized inconsistently.
- Some paths compare case-sensitively.
- Campaign fallback removed.
- Rejection reason collapsed to INVALID_COUPON.
```

## CheckoutLogger.java

Before:

```text
- Logged customerId and correlationId.
- Did not log email address.
```

After:

```text
- Logs masked customerEmail.
- Logs coupon code.
- Logs generic rejection reason.
```

## Tests

Before:

```text
- Tested lowercase coupon acceptance.
- Tested campaign fallback.
- Tested specific rejection reason codes.
```

After:

```text
- Tests expect INVALID_COUPON.
- Lowercase coupon test removed.
- Campaign fallback test removed.
```

## Architect Question

Was this a cleanup, or did it change production behavior?
