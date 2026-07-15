# Governed Restart Prompt

Use this prompt after rejecting the unsafe PR.

```text
Analyze the checkout module for discount-support readiness.

Do not modify files yet.

First produce:
1. Current checkout behavior and total calculation flow.
2. Current API response fields and compatibility expectations.
3. Current tax calculation behavior.
4. Current refund behavior and dependencies.
5. Existing pricing and promotion boundaries.
6. Existing test coverage and test gaps.
7. Security risks around discount authorization and abuse.
8. Data that must be persisted for audit, support, refunds, and finance.
9. Observability requirements for accepted and rejected discounts.
10. Proposed implementation plan in small reviewable PRs.
11. Files likely to change.
12. Rollback and feature-flag strategy.

Constraints:
- Preserve existing public API behavior unless explicitly approved.
- Do not change tax calculation semantics without product and finance approval.
- Do not bypass promotion authorization rules.
- Do not duplicate promotion logic inside checkout if a promotion boundary exists.
- Do not remove or weaken existing tests.
- Add characterization tests before refactoring pricing behavior.
- Do not log payment tokens, discount secrets, PII, or sensitive customer data.
- Keep the first PR limited to analysis and tests.
- Wait for approval before modifying files.
```
