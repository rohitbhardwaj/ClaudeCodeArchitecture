# Strong Sample Answer

```text
Analyze the checkout bug before modifying files.

Do not edit files yet.

Inspect:
- CLAUDE.md
- relevant controller
- service
- domain policy
- existing tests
- OpenAPI/API contract
- CODEOWNERS if approval may be needed

Return:
1. problem restatement
2. files inspected
3. likely root cause
4. behavior that must remain unchanged
5. proposed small implementation plan
6. tests needed
7. architecture/security/API risks
8. approval checkpoint before coding

Wait for approval before making changes.
```

## Why This Is Strong

It prevents immediate editing.

It requires Claude to inspect the repository, identify root cause, define scope, surface risks, and stop before coding.
