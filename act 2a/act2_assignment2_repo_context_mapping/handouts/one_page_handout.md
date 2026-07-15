# One-Page Handout — Repo Context Mapping

## Weak Prompt

```text
Fix the checkout bug.
```

## Better First Step

```text
Map the repo context before changing code.
```

## Context Map

```text
Feature / bug: Checkout failure

1. Entry point:
2. Core business logic:
3. External dependencies:
4. Data/persistence:
5. Tests:
6. API contract:
7. Security-sensitive areas:
8. Files Claude may inspect:
9. Files Claude may modify only after approval:
10. Files Claude must not modify:
```

## Why It Matters

Checkout may involve:

```text
API behavior
pricing
tax
coupon validation
payment
inventory
order persistence
tests
logs
PII
support reason codes
rollback
```

## Key Lesson

```text
Repo-aware work starts with repo context, not code generation.
```

## Architect Reminder

Before Claude changes code, define:

```text
what to inspect
what requires approval
what must not be touched
```
