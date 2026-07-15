# Assignment Instructions

## Scenario

Claude generated a diff for a checkout bug.

The diff:

```text
moves coupon validation into controller
changes INVALID_COUPON to COUPON_FAILED
logs customer email
removes a failing test
adds one happy-path test
does not mention rollback
```

## Architect Task

Review the diff and decide whether to approve, request changes, or block.

## Review Checklist

```text
[ ] Architecture boundaries preserved
[ ] Public API behavior preserved
[ ] PII not logged
[ ] Existing tests preserved
[ ] Tests added
[ ] Tests removed
[ ] Assertions weakened
[ ] Failure paths covered
[ ] Rollback plan included
[ ] Required approvals identified
```

## Key Lesson

```text
Reviewing Claude’s diff is not just code review; it is architecture, safety, and governance review.
```
