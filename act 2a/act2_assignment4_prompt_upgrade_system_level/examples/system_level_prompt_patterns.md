# System-Level Prompt Patterns

## Pattern 1 — Analyze Before Code

```text
Analyze [problem] before modifying files.
Do not change code yet.
```

## Pattern 2 — Inspect Related Files

```text
First inspect:
- entry point
- core service
- helper classes
- external clients
- tests
- API contracts
- CLAUDE.md
```

## Pattern 3 — Explain Current Behavior

```text
Summarize the current flow and behavior that must remain unchanged.
```

## Pattern 4 — Identify Root Causes

```text
List likely root causes with evidence.
```

## Pattern 5 — Identify Tests

```text
List existing tests that protect this behavior and missing tests needed before a fix.
```

## Pattern 6 — List Risks

```text
List API, security, payment, pricing, tax, coupon, and rollback risks.
```

## Pattern 7 — Ask Approval

```text
Propose a small-step plan and wait for approval before modifying files.
```
