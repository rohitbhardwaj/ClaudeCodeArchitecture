# Reusable System-Level Prompt Template

```text
Analyze [problem] before modifying files.

Do not change code yet.

First inspect:
1. [entry point]
2. [core service]
3. [helper/calculator/validator]
4. [external dependency usage]
5. [tests]
6. [API contract]
7. [CLAUDE.md or repository guidance]

Then produce:
1. Current flow.
2. Likely root causes.
3. Impacted files.
4. Existing tests that protect this behavior.
5. Missing tests.
6. Security or API risks.
7. Proposed small-step fix plan.
8. Rollback risk.

Constraints:
- Preserve public API behavior.
- Do not change high-risk behavior without approval.
- Do not remove or weaken tests.
- Do not log sensitive data.
- Wait for approval before modifying files.
```
