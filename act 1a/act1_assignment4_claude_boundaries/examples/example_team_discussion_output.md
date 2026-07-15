# Example Team Discussion Output

## Question

Which “must ask first” rule would prevent the most damage in your organization?

## Example Answer

```text
Claude must ask first before changing authentication, authorization, payment, pricing, tax, refund, public API, or database migration behavior.
```

## Why

These areas create the largest blast radius.

## Damage Prevented

```text
privilege escalation
incorrect customer charges
tax calculation errors
broken mobile clients
data loss
compliance violations
production incidents
rollback failures
```

## Follow-Up Rule for CLAUDE.md

```text
For any change touching auth, payment, pricing, tax, refunds, public APIs, or migrations, Claude must stop after analysis, list risks, identify impacted files, propose a small-step plan, and wait for human approval before editing.
```
