# Blast Radius Before Implementation Policy

## Purpose

Prevent Claude from implementing production-impacting changes before the blast radius is understood.

## Policy

Before coding, Claude must identify impact areas, risks, tests, rollback, and approvals.

## Required for

```text
pricing
discounts
payments
tax
refunds
public API
data model
fraud/security
analytics
support workflows
```

## Key Rule

```text
No blast-radius analysis, no implementation.
```
