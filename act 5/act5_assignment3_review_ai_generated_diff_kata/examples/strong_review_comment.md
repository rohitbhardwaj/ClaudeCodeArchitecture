# Strong Review Comment

```text
Blocking this diff.

It moves coupon validation into the controller, which violates our architecture boundary. It changes the public error code from INVALID_COUPON to COUPON_FAILED without API owner approval. It logs customer email, which creates a PII risk. It removes a failing test and adds only one happy-path test, so failure paths are not protected. It also lacks rollback and required approvals.

Please revise the plan before editing:
- keep coupon validation in domain/service layer
- preserve INVALID_COUPON
- use correlation ID, not customer email
- keep existing tests
- add failure-path tests
- include rollback plan
- identify required approvals
```
