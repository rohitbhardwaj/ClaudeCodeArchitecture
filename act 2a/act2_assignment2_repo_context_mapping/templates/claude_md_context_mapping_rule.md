# CLAUDE.md Rule — Context Mapping Before Code Changes

Copy or adapt this into CLAUDE.md.

```markdown
## Context Mapping Requirement

For multi-file, production, or behavior-sensitive work, Claude must not modify files immediately.

Before coding, Claude must create a repo context map:

1. Entry point
2. Core business logic
3. External dependencies
4. Data/persistence
5. Tests
6. API contract
7. Security-sensitive areas
8. Files Claude may inspect
9. Files Claude may modify only after approval
10. Files Claude must not modify

Claude must then summarize:
- current behavior
- behavior that must remain unchanged
- likely risks
- missing tests
- proposed small-step plan

Claude must wait for approval before modifying files.
```
