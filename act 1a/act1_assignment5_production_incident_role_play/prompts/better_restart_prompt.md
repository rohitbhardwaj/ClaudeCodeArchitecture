# Better Restart Prompt

Use this prompt after the incident to restart the work safely.

```text
Analyze checkout coupon validation and pricing logic for maintainability issues.

Do not modify files yet.

First produce:
1. Current coupon validation behavior.
2. Current coupon matching rules, including case sensitivity.
3. Current campaign fallback behavior.
4. Current rejection reason codes and support-facing behavior.
5. Current logging behavior and whether any PII is logged.
6. Existing tests that protect coupon behavior.
7. Test gaps and risky areas.
8. Proposed refactoring plan in small reviewable steps.
9. Files likely to change.
10. Risks and rollback plan.

Constraints:
- Preserve existing coupon behavior unless explicitly approved.
- Preserve support-facing reason codes unless explicitly approved.
- Do not log customer email, partial email, payment tokens, secrets, or PII.
- Do not remove or weaken tests.
- Add characterization tests before refactoring validation logic.
- Keep behavior-changing work separate from cleanup work.
- Wait for approval before modifying files.
```
