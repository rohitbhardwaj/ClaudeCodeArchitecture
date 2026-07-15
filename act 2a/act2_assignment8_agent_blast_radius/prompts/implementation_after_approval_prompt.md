# Implementation Prompt After Approval

Use only after blast radius and approvals are complete.

```text
Implement the approved promotional discount code change.

Approved scope:
[Paste approved scope]

Constraints:
- Change only approved files.
- Preserve existing checkout API behavior unless explicitly approved.
- Preserve payment, tax, refund, and pricing rules as documented.
- Do not log PII, payment tokens, or customer email.
- Use the approved feature flag.
- Add tests for happy path, invalid, expired, unauthorized, tax, refund, and rollback behavior.
- Keep the PR small and reviewable.

After implementation:
1. Summarize changed files.
2. List behavior changes.
3. List tests added.
4. List approvals still needed.
5. List rollback steps.
```
