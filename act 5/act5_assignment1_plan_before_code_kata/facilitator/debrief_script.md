# Debrief Script

## Opening

The weak prompt was:

```text
Fix the checkout bug.
```

That prompt gives Claude permission to start editing immediately.

## Strong Prompt Pattern

```text
Analyze before modifying files.
Do not edit files yet.
Inspect repo context.
Return root cause, plan, tests, risks, and approval checkpoint.
Wait for approval.
```

## Why It Matters

This one habit prevents many downstream problems:

```text
wrong file edited
business logic moved to controller
public API changed
tests removed
PII logged
large unsafe diff created
```

## Closing Line

The first Claude Code prompt should often be analysis, not implementation.
