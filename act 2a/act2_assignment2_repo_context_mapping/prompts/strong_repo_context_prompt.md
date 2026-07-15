# Strong Repo Context Prompt

```text
Analyze the checkout failure before modifying files.

Do not change code yet.

First inspect:
1. CheckoutController
2. CheckoutService
3. PricingCalculator
4. CouponValidator
5. PaymentClient usage
6. InventoryClient usage
7. TaxService usage
8. OrderRepository usage
9. CheckoutServiceTest
10. CouponValidatorTest
11. openapi.yaml checkout contract
12. CLAUDE.md repository guidance

Then produce:
1. Current checkout flow.
2. Entry point and related files.
3. Likely root causes.
4. External dependencies involved.
5. Existing tests that protect this behavior.
6. Missing tests.
7. API contract risks.
8. Security-sensitive areas.
9. Files that may need changes.
10. Files that should not be modified.
11. Proposed small-step fix plan.
12. Rollback risk.

Constraints:
- Preserve public API behavior.
- Do not change payment, pricing, tax, coupon, or persistence behavior without approval.
- Do not remove or weaken tests.
- Do not log payment tokens, secrets, or PII.
- Ask for approval before modifying files.
```
