# After-Approval Implementation Prompt

Use only after the architect approves the plan.

```text
Implement the approved checkout fix using the approved plan.

Scope:
[Paste approved scope]

Constraints:
- Change only approved files.
- Preserve public API behavior.
- Preserve payment, pricing, tax, and coupon behavior unless explicitly included in the approved scope.
- Do not remove or weaken tests.
- Do not log sensitive data.
- Keep the change small and reviewable.

After implementation:
1. Summarize changed files.
2. Explain behavior preserved.
3. List tests added or updated.
4. List tests run.
5. List remaining risks.
```
