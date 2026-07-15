# Agent Blast Radius Guide

## What Is Blast Radius?

Blast radius is the set of systems, behaviors, people, and risks affected by a change.

For AI-assisted coding, blast radius matters because Claude Code may generate changes quickly across multiple files.

## Why Architects Must Estimate It First

A request like:

```text
Add support for promotional discount codes during checkout.
```

may sound like a small feature.

But it can affect:

```text
checkout UI
API responses
pricing math
tax calculation
payment amount
refund rules
fraud controls
data storage
analytics
support workflows
logs
tests
rollback
approval routing
```

## Core Principle

```text
The prompt should not start with implementation.
It should start with blast-radius analysis.
```

## Blast Radius Categories

### User-visible behavior

What customers see and experience.

### API contract

Fields, error codes, status codes, schemas, and backward compatibility.

### Pricing

Subtotal, discounts, totals, rounding, and stacking rules.

### Tax

Tax basis, taxable amount, jurisdiction rules, and compliance.

### Payment

Payment amount, authorization, capture, idempotency, and reconciliation.

### Refunds

Refund amount, partial refunds, discount proration, and support handling.

### Fraud/abuse

Coupon brute force, eligibility abuse, replay, account sharing, and promotion leakage.

### Data model

New fields, tables, indexes, migrations, and data retention.

### Analytics

Promotion acceptance, rejection, conversion, cart abandonment, campaign attribution.

### Support

Reason codes, customer explanations, manual overrides, and troubleshooting.

### Observability

Safe logs, metrics, traces, alerts, correlation IDs.

### Tests

Happy path, failure path, edge cases, compatibility, tax, payment, refund, feature flag.

### Rollback

Feature flags, safe disablement, migration rollback, and monitoring.

### Required approvals

Architecture, product, security, finance, QA, support, data, platform.
