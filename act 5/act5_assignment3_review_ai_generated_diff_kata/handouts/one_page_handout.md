# One-Page Handout — Review the AI-Generated Diff Kata

## Bad Diff Signals

```text
moves coupon validation into controller
changes INVALID_COUPON to COUPON_FAILED
logs customer email
removes a failing test
adds one happy-path test
does not mention rollback
```

## Strong Decision

```text
Block the diff.
```

## Key Lesson

```text
Reviewing Claude’s diff is not just code review; it is architecture, safety, and governance review.
```

## Safer Response

```text
Keep validation in domain/service layer.
Preserve INVALID_COUPON.
Use correlation ID, not email.
Keep existing tests.
Add failure-path tests.
Include rollback.
Identify approvals.
```
