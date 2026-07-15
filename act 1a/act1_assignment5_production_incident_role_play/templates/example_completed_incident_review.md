# Example Completed 5-Part Incident Review

## 1. What changed?

The PR changed coupon validation behavior, logging behavior, and tests.

Specific changes:

```text
case-insensitive coupon behavior changed
campaign fallback was removed
specific rejection reason codes became generic
partial customer email was logged
tests were updated to match new behavior
```

## 2. What should have been caught before merge?

```text
valid coupons could be rejected
support reason codes became less useful
PII-like data appeared in logs
tests no longer protected old coupon behavior
no product approval existed for coupon behavior change
no security approval existed for logging change
```

## 3. Which prompt constraint was missing?

```text
Preserve existing coupon validation behavior, rejection reason codes, and support-facing behavior unless explicitly approved. Do not log customer email or PII. Do not remove or weaken tests. Analyze first and wait for approval before modifying validation logic.
```

## 4. Which quality gate was missing?

```text
behavior characterization tests
PII logging scanner
support reason-code contract tests
CODEOWNER review for checkout and coupon validation
architecture approval for validation changes
product approval for customer-visible coupon behavior
```

## 5. What rule should be added to CLAUDE.md?

```text
Claude must not change checkout, coupon, pricing, tax, payment, refund, public API, logging, or support-facing behavior without first documenting current behavior, listing risks, proposing a small-step plan, and receiving explicit approval.
```

## Final Classification

```text
Governance failure.
```

## Why

The AI-generated code was allowed to enter production without sufficient prompt constraints, review gates, characterization tests, or approval boundaries.
