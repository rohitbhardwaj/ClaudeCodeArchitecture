# Decision Principles

Use these principles when classifying a Claude Code task.

## Principle 1 — Read-only is usually safer

If Claude is only reading, explaining, summarizing, or drafting, it is usually safer.

But output should still be reviewed.

## Principle 2 — Behavior-changing work needs approval

If a task can change production behavior, classify it as needs approval.

Examples:

```text
payment
pricing
tax
refunds
auth
public APIs
data migrations
customer-visible behavior
```

## Principle 3 — Sensitive data exposure is not allowed

If a task can expose secrets, payment tokens, API keys, credentials, PII, or customer data, it should be forbidden.

## Principle 4 — Bypassing review is not allowed

Claude should not merge, commit directly to protected branches, disable CI, or bypass review gates.

## Principle 5 — Tests are protected assets

Claude may generate tests.

Claude must not silently remove tests, weaken assertions, or change tests only to match new behavior.

## Principle 6 — Risk depends on module context

A private helper method in a UI formatting module may be safe.

A private helper method in payment, auth, tax, or pricing may need approval.

## Principle 7 — When in doubt, move stricter

```text
Safe now → Needs approval → Not allowed
```
