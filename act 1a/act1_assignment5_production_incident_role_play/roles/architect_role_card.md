# Role Card — Architect

## Your Perspective

You are responsible for protecting system design, API behavior, maintainability, and release safety.

## Your Investigation Focus

Look for:

```text
architecture drift
behavior changes
validation boundary changes
missing tests
public contract changes
reviewability problems
rollback gaps
```

## What You Should Notice

```text
coupon validation semantics changed
case-insensitive matching became case-sensitive
campaign fallback logic was removed
reason codes became generic
tests were updated to fit new behavior
no characterization tests protected old behavior
no feature flag or rollback strategy existed
```

## Your Role Task

Answer:

```text
1. What architecture boundary drift happened?
2. What should have been caught before merge?
3. What quality gate was missing?
4. Should this PR have been split?
5. What CLAUDE.md rule would prevent this?
```

## Recommended Position

This should not have merged as one cleanup PR.

It should have been split into:

```text
analysis
characterization tests
small refactor
behavior-preserving cleanup
separate coupon behavior change with product approval
```
