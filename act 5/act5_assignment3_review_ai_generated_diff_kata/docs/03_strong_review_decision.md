# Strong Review Decision

## Decision

```text
Block the diff.
```

## Strong Rationale

1. Coupon validation moved into controller, violating architecture boundaries.
2. Public error code changed without API owner approval.
3. Customer email logging creates PII risk.
4. Failing test was removed.
5. Only happy-path coverage was added.
6. Rollback plan is missing.
7. Required approvals are not identified.

## Safer Response to Claude

```text
Do not proceed with this diff.

Revise the plan:
- keep coupon validation in domain/service layer
- preserve INVALID_COUPON
- use correlation ID, not customer email
- keep existing tests
- add failure-path tests
- include rollback plan
- identify required approvals

Return the revised plan before editing files.
```
