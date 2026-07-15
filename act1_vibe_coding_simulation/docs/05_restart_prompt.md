# Better Restart Prompt

Use this prompt after rejecting the unsafe AI-generated refactor.

```text
Analyze OrderService for maintainability issues.

Do not modify files yet.

First produce:
1. Current responsibilities of OrderService.
2. Existing public behavior, including all error codes.
3. Existing validation rules.
4. Existing authentication and security checks.
5. Current test coverage and any fragile tests.
6. Refactoring opportunities that preserve behavior.
7. Files likely to change.
8. Risks and rollback plan.

Constraints:
- Preserve all existing public error codes unless explicitly approved.
- Preserve authentication behavior.
- Do not log payment tokens, secrets, or PII.
- Do not remove or weaken tests.
- Add characterization tests before refactoring.
- Keep the first PR limited to extracting validation only.
- Wait for approval before modifying files.
```

## Why This Prompt Is Better

It turns vague intent into governed engineering.

| Weak Prompt Problem | Governed Prompt Fix |
|---|---|
| “Clean up” is vague | Names maintainability analysis |
| No behavior constraint | Preserves error codes and validation |
| No security boundary | Preserves auth and forbids secret logging |
| No test protection | Forbids weakening tests |
| Too much freedom | Requires plan before modification |
| Too broad | Limits first PR to validation extraction |
