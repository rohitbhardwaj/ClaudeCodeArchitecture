# Expected Findings from the Source Simulation

The source simulation is designed to show why a file-level prompt is dangerous.

## Weak Prompt

```text
Fix the bug in CheckoutService.java.
```

## Why This Is Misleading

The checkout failure appears in `CheckoutService`, but the root cause can involve:

```text
CouponValidator normalizes coupons incorrectly
CheckoutController maps error codes to HTTP responses
openapi.yaml defines expected response behavior
CheckoutServiceTest protects checkout behavior
CouponValidatorTest protects coupon behavior
CLAUDE.md says coupon behavior must not change without approval
```

## What Participants Should Notice

```text
1. The root cause may be in CouponValidator, not CheckoutService.
2. Fixing only CheckoutService may duplicate coupon logic.
3. Changing CheckoutService may accidentally change payment behavior.
4. API response codes must remain consistent with openapi.yaml.
5. Existing tests must be inspected before coding.
6. A safe fix requires identifying related files first.
```

## Best Architect Move

Do not allow Claude to edit `CheckoutService.java` immediately.

Require system-level analysis first.
