# Analysis-Only Prompt

Use this when you want Claude Code to investigate without making changes.

```text
Analyze the checkout failure in analysis-only mode.

Do not modify files.

Return:
1. Current checkout flow.
2. Related files and responsibilities.
3. Possible root causes.
4. Evidence supporting each root cause.
5. Existing tests that should detect this.
6. Missing tests.
7. API contract risks.
8. Security risks.
9. Recommended first safe change.
10. Questions for the architect.

Do not edit files, run destructive commands, or update tests.
```
