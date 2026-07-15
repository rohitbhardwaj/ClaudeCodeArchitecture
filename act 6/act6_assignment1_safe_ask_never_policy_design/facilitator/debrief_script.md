# Debrief Script

## Opening

This exercise defines the line between acceleration and unsafe autonomy.

## Key Message

Safe tasks are usually read-only or draft-only.

Ask-first tasks change architecture, API, dependencies, payment, CI/CD, or production behavior.

Never tasks violate safety, privacy, or review discipline.

## Strong Classifications

```text
Explain unfamiliar code: Safe
Generate draft tests: Safe/Ask
Refactor controller: Ask first
Change public API error code: Ask first / never without approval
Add dependency: Ask first
Modify payment logic: Ask first
Remove failing test: Never silently
Update docs: Safe
Change CI/CD: Ask first
Add PII logging: Never
```

## Closing Line

Claude Code needs explicit authority boundaries before it can scale.
