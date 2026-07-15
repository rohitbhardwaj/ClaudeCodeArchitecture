# Expected Source Repo Analysis

If participants use the included source repo, a strong analysis prompt should ask Claude to inspect:

```text
CLAUDE.md
CODEOWNERS
api/openapi.yaml
CheckoutController.java
CheckoutService.java
CheckoutPolicy.java
CheckoutServiceTest.java
```

## Likely Root Cause

```text
CheckoutPolicy rejects cart totals at or below zero, but checkout behavior may need clearer handling for empty cart or invalid coupon-like conditions depending on the bug report.
```

## Behavior to Preserve

```text
Public error codes
Controller boundaries
Domain policy location
No PII logging
Existing tests
Payment behavior
```

## Tests Needed

```text
successful checkout
invalid checkout behavior
public error code preservation
failure path
boundary behavior
```

## Risks

```text
API behavior
architecture boundary
test weakening
payment/pricing drift
missing approval owner
```
