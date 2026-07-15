# Recommended PR Split

A safer implementation should be split into small, reviewable PRs.

## PR 1 — Characterization Tests

Add tests for current checkout behavior:

```text
subtotal calculation
tax calculation
total calculation
payment amount
receipt fields
order persistence
error behavior
```

No production logic changes.

## PR 2 — Architecture Design

Add or document boundaries:

```text
PromotionService
PricingPolicy
TaxPolicy
FeatureFlag
AuditEvent
```

No behavior change yet.

## PR 3 — Discount Data Model

Add discount fields safely:

```text
discountCode
discountAmount
promotionId
discountReason
```

Include migration and backward compatibility plan.

## PR 4 — Discount Validation

Implement validation through promotion boundary:

```text
expiration
eligibility
usage limits
fraud controls
authorization
```

## PR 5 — Checkout Integration Behind Feature Flag

Apply discount only when the feature flag is enabled.

## PR 6 — Observability and Rollback

Add audit events, metrics, alerts, and rollback documentation.
