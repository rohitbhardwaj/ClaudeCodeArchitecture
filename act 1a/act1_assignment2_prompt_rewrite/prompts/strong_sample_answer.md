# Strong Sample Answer

```text
Analyze the checkout module for maintainability and production-readiness issues.

Do not modify files yet.

First produce:
1. Current responsibilities of the module.
2. Current API behavior and error responses.
3. Dependencies on payment, inventory, cart, and order services.
4. Signs of hidden coupling or mixed concerns.
5. Existing test coverage and test gaps.
6. Security and validation risks.
7. Proposed refactoring plan in small reviewable steps.
8. Files likely to change.
9. Behavior that must remain unchanged.
10. Rollback risks.

Constraints:
- Preserve public API behavior.
- Preserve existing error codes unless explicitly approved.
- Do not remove or weaken existing tests.
- Do not introduce new frameworks.
- Keep domain logic out of controllers.
- Keep payment logic behind the existing payment boundary.
- Do not log payment tokens, secrets, or PII.
- Add characterization tests before refactoring behavior.
- Keep the first PR limited to analysis or one small extraction.
- Wait for approval before modifying files.
```

## Why This Is Strong

This prompt is strong because it changes the task from:

```text
Go improve the code.
```

to:

```text
Analyze the system, preserve behavior, identify risks, propose a plan, and wait for approval.
```

That is the difference between vibe coding and governed engineering.
