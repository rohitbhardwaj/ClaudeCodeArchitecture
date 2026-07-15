# Governed Prompt Template

Use this template to rewrite the weak prompt.

```text
Analyze the [MODULE_NAME] for [GOAL].

Do not modify files yet.

First produce:
1. Current responsibilities of the module.
2. Current public API behavior and error responses.
3. Existing validation rules.
4. External dependencies and system boundaries.
5. Existing test coverage and test gaps.
6. Architecture risks and hidden coupling.
7. Security, privacy, and logging risks.
8. Files likely to change.
9. Behavior that must remain unchanged.
10. Proposed small-step refactoring plan.
11. Rollback risks.

Constraints:
- Preserve public API behavior unless explicitly approved.
- Preserve existing error codes and response contracts unless explicitly approved.
- Do not remove or weaken tests.
- Do not introduce new frameworks.
- Keep domain logic out of controllers.
- Keep payment logic behind the existing payment boundary.
- Do not log secrets, tokens, or PII.
- Keep the first implementation PR small and reviewable.
- Wait for approval before modifying files.
```
