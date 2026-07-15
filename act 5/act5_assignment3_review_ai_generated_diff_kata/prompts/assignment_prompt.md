# Assignment Prompt

```text
Review this Claude-generated checkout bug diff.

The diff:
- moves coupon validation into controller
- changes INVALID_COUPON to COUPON_FAILED
- logs customer email
- removes a failing test
- adds one happy-path test
- does not mention rollback

Decide whether to approve, request changes, or block.

Use this checklist:
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

Return:
1. decision
2. rationale
3. safer response to Claude
```
