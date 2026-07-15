# Example CLAUDE.md Rules From Reflection

## Rule 1 — Behavior Preservation

```markdown
Before changing existing production behavior, summarize the current behavior, list impacted files, identify tests that protect it, and ask for approval.
```

## Rule 2 — API Compatibility

```markdown
Do not change public API response fields, error codes, status codes, or semantics without explicit approval and contract tests.
```

## Rule 3 — Security-Sensitive Changes

```markdown
Do not modify authentication, authorization, permission checks, session handling, or token logic without security and architecture approval.
```

## Rule 4 — Test Integrity

```markdown
Do not remove tests, weaken assertions, or update tests merely to match changed behavior without explaining why and receiving approval.
```

## Rule 5 — Logging

```markdown
Do not log secrets, payment tokens, email addresses, partial email addresses, customer PII, or sensitive identifiers.
```

## Rule 6 — Legacy Refactoring

```markdown
For legacy refactors, add characterization tests first. Keep refactors small and behavior-preserving unless a behavior change is explicitly approved.
```

## Rule 7 — Dependencies

```markdown
Do not add or upgrade dependencies without explaining why, listing alternatives, checking license/security impact, and receiving approval.
```

## Rule 8 — Database Changes

```markdown
Do not modify database schemas, migrations, indexes, or persistence behavior without a rollback plan and data-owner approval.
```
