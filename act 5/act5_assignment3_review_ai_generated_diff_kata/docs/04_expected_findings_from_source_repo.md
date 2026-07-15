# Expected Findings from Source Repo

The source repo includes a bad AI-generated diff patch and a normal source tree.

Participants should identify these issues:

## Architecture Boundary Violation

```text
Coupon validation is moved into CheckoutController.
```

## API Contract Violation

```text
INVALID_COUPON is changed to COUPON_FAILED.
```

## PII Logging Risk

```text
Customer email is logged.
```

## Test Integrity Problem

```text
A failing test is removed.
Only one happy-path test is added.
Failure paths are not covered.
```

## Governance Gaps

```text
No rollback plan.
No required approvals.
```

## Correct Decision

```text
Block the diff.
```
