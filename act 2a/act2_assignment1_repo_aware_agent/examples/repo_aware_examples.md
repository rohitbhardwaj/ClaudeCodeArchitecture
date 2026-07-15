# Repo-Aware Examples

## Autocomplete-Style Prompt

```text
Fix the checkout bug.
```

## Repo-Aware Prompt

```text
Analyze the checkout bug before modifying files.

Do not code yet.

First inspect:
1. CheckoutController
2. CheckoutService
3. PricingCalculator
4. CouponValidator
5. PaymentClient usage
6. CheckoutServiceTest
7. API contract
8. CLAUDE.md

Then produce:
1. Current checkout flow.
2. Related files.
3. Possible root causes.
4. Existing tests.
5. Missing tests.
6. Behavior that must remain unchanged.
7. Security or API risks.
8. Proposed small-step fix plan.

Wait for approval before modifying files.
```

## Workflow-Agent Prompt

```text
After the approved checkout fix is implemented:

1. Run the relevant tests.
2. Summarize failures if any.
3. Explain changed files.
4. Draft a PR summary.
5. List architecture impact.
6. List security impact.
7. Identify rollback risk.
8. Suggest documentation updates.

Do not merge or bypass review.
```
