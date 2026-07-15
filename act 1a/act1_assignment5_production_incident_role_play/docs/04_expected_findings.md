# Expected Findings

## What Changed?

The Claude-generated PR changed more than cleanup:

```text
coupon validation became case-sensitive
campaign fallback behavior was removed
rejection reason codes became generic
partial customer email was added to logs
tests were changed to match new behavior
quality gates did not detect API or behavior drift
```

## What Should Have Been Caught Before Merge?

```text
coupon validation behavior changed
valid coupons could be rejected
logs contain partial customer emails
support reason codes became less useful
tests were weakened or narrowed
no rollback or feature flag plan existed
no product approval for coupon behavior change
no security approval for logging change
```

## Missing Prompt Constraints

The original prompt did not say:

```text
preserve existing coupon behavior
do not change coupon matching semantics
do not log customer email or PII
do not weaken tests
summarize behavior changes before coding
identify impacted files
ask approval before modifying validation logic
```

## Missing Quality Gates

```text
behavior characterization tests
coupon compatibility tests
PII logging scanner
API/reason-code contract checks
CODEOWNER review for pricing/coupon logic
support workflow review
feature flag or rollback check
architecture review for validation changes
```

## Rule to Add to CLAUDE.md

```text
Claude must not change checkout, pricing, coupon, tax, payment, refund, authentication, authorization, public API, logging, or data-migration behavior without first summarizing current behavior, listing risks, proposing a small-step plan, and receiving explicit approval.
```
