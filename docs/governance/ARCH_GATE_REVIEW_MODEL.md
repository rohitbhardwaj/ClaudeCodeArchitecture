# ARCH-GATE Review Model

Use ARCH-GATE to review Claude-assisted changes.

## A — Architecture Fit

```text
Does the change preserve system boundaries?
Is the logic in the right layer?
Does it increase coupling?
```

## R — Risk and Rollback

```text
What can go wrong?
Is rollback defined?
Is there a feature flag or revert plan?
```

## C — Correctness

```text
Does the code implement the intended behavior?
Are edge cases handled?
```

## H — Hidden Coupling

```text
Did the change create dependencies between unrelated modules?
Did it alter behavior outside the intended scope?
```

## G — Guardrails / Security

```text
Does it preserve auth, validation, privacy, and security controls?
Does it avoid PII logging?
```

## A — Automated Tests

```text
Are happy paths and failure paths tested?
Were tests weakened or deleted?
```

## T — Traceability / Observability

```text
Can we understand what happened in production?
Are logs safe?
Are metrics meaningful?
```

## E — Evolution / Maintainability

```text
Will this be easy to change later?
Is the PR small and reviewable?
```
