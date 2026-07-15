# Strong System-Level Prompt

```text
Analyze the checkout failure before modifying files.

Do not change code yet.

First inspect:
1. CheckoutService.java
2. CheckoutController.java
3. PricingCalculator.java
4. CouponValidator.java
5. PaymentClient usage
6. CheckoutServiceTest.java
7. CouponValidatorTest.java
8. API contract for checkout responses
9. CLAUDE.md repository guidance

Then produce:
1. Current checkout flow.
2. Likely root causes.
3. Impacted files.
4. Existing tests that protect this behavior.
5. Missing tests.
6. Security or API risks.
7. Proposed small-step fix plan.
8. Rollback risk.

Constraints:
- Preserve public API behavior.
- Do not change payment, pricing, tax, or coupon behavior without approval.
- Do not remove or weaken tests.
- Do not log sensitive data.
- Wait for approval before modifying files.
```
