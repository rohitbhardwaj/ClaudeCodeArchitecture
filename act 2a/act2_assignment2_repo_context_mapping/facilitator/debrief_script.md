# Debrief Script

Use this after participants complete the context map.

## Opening

The prompt “fix the checkout bug” sounds efficient.

But it hides the most important information.

## Key Point

Checkout is not one file.

Checkout is a flow across:

```text
controller
service
pricing
coupon validation
payment
inventory
tax
persistence
tests
API contract
logs
security rules
```

## Main Lesson

When we skip context mapping, we invite local fixes that break system behavior.

## Talk Track

Say:

```text
Claude Code can reason across a repo.
That is powerful.
But if we do not define the repo context, Claude may infer the wrong boundaries.
```

## Transition

A context map gives Claude three important signals:

```text
what to inspect
what to ask before changing
what not to touch
```

## Closing Line

Repo-aware work starts with repo context, not code generation.
