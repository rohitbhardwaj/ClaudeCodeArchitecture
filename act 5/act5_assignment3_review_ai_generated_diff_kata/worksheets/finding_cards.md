# Finding Cards

## Architecture Boundary

Finding:

```text
Coupon validation moved into controller.
```

Decision:

```text
Block.
```

Reason:

```text
Business/domain logic belongs in domain/service layer.
```

## API Behavior

Finding:

```text
INVALID_COUPON changed to COUPON_FAILED.
```

Decision:

```text
Block.
```

Reason:

```text
Public API behavior changed without API owner approval.
```

## PII Logging

Finding:

```text
Customer email is logged.
```

Decision:

```text
Block.
```

Reason:

```text
PII logging risk.
```

## Test Removal

Finding:

```text
Falling coupon test removed.
```

Decision:

```text
Block.
```

Reason:

```text
Weakens safety net.
```

## Happy Path Only

Finding:

```text
Only one happy-path test added.
```

Decision:

```text
Request failure-path coverage.
```

Reason:

```text
Failure paths and public error codes are not protected.
```

## Missing Rollback

Finding:

```text
Rollback plan is missing.
```

Decision:

```text
Request changes.
```

Reason:

```text
Production-impacting changes need rollback strategy.
```

## Missing Approvals

Finding:

```text
Required approvals are not identified.
```

Decision:

```text
Request changes.
```

Reason:

```text
Architecture, API, security, and QA owners may be needed.
```
