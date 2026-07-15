# Debrief Script

## Opening

This is the exact kind of AI-generated diff that can look useful while being unsafe.

## Findings

```text
Architecture boundary violation
Public API behavior change
PII logging
Removed failing test
Happy-path-only coverage
Missing rollback
Missing approvals
```

## Decision

```text
Block the diff.
```

## Safer Direction

```text
Keep validation in domain/service layer.
Preserve INVALID_COUPON.
Use correlation ID, not email.
Keep existing tests.
Add failure-path tests.
Include rollback.
Identify approvals.
```

## Closing Line

Reviewing Claude’s diff is not just code review; it is architecture, safety, and governance review.
