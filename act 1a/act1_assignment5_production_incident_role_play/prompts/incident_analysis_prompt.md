# Incident Analysis Prompt

Use this prompt with Claude Code during the incident investigation.

```text
Analyze the recent checkout coupon PR as an incident.

Do not modify files.

Compare current behavior against previous behavior.

Identify:
1. Files changed.
2. Coupon validation behavior changes.
3. Case-sensitivity changes.
4. Rejection reason-code changes.
5. Logging changes involving customer data or PII.
6. Tests removed, weakened, or changed.
7. Missing characterization tests.
8. Possible customer impact.
9. Rollback options.
10. Recommended CLAUDE.md rules to prevent recurrence.

Return the analysis as an incident review draft.
```
