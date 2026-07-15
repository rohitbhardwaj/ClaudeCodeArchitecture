# Assignment Instructions

## Scenario

Claude Code is asked to help with a checkout failure.

The weak prompt is:

```text
Fix the checkout bug.
```

The problem is that checkout behavior depends on many files:

```text
CheckoutController
CheckoutService
PricingCalculator
CouponValidator
PaymentClient
OrderRepository
CheckoutServiceTest
CouponValidatorTest
openapi.yaml
CLAUDE.md
```

## Your Role

You are the architect.

Before Claude modifies code, create a repo context map.

## Why This Matters

The bug may not live in one file.

It may involve:

```text
API behavior
business logic
pricing rules
coupon validation
external payment behavior
data persistence
test coverage
security-sensitive logging
repository guidance
```

## Required Output

Fill out the context map:

```text
Feature / bug: Checkout failure

1. Entry point:
2. Core business logic:
3. External dependencies:
4. Data/persistence:
5. Tests:
6. API contract:
7. Security-sensitive areas:
8. Files Claude may inspect:
9. Files Claude may modify only after approval:
10. Files Claude must not modify:
```

## Discussion Question

```text
What context would Claude miss if you simply said “fix the bug”?
```
