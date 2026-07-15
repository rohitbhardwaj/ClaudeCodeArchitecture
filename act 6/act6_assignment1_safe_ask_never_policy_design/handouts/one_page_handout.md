# One-Page Handout — Safe / Ask / Never Policy

## Key Lesson

```text
Claude Code needs explicit authority boundaries before it can scale.
```

## Safe

```text
Read-only analysis, explanation, docs drafts, draft tests.
```

## Ask First

```text
Refactors, API changes, dependencies, payment logic, CI/CD, tests that affect production behavior.
```

## Never

```text
PII logging, silent removal of failing tests, weakened assertions, bypassing approvals, hiding Claude involvement.
```

## Strong Rule

```text
If it affects money, security, public contracts, delivery pipelines, or test safety, Claude must ask first.
```
