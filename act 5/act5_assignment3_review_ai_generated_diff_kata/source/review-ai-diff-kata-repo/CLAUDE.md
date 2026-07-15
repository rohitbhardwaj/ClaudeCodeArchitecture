# CLAUDE.md

## Diff Review Rules

- Coupon validation belongs in domain/service layer.
- Preserve INVALID_COUPON unless API owner approves change.
- Do not log customer email or PII.
- Do not remove failing tests silently.
- Add failure-path tests, not only happy-path tests.
- Include rollback plan.
- Identify required approvals.
