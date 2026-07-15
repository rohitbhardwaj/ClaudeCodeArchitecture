# Strong Sample Answer

Feature / bug: Checkout failure

## 1. Entry Point

```text
CheckoutController
```

## 2. Core Business Logic

```text
CheckoutService
PricingCalculator
CouponValidator
```

## 3. External Dependencies

```text
PaymentClient
InventoryClient
TaxService
```

## 4. Data/Persistence

```text
OrderRepository
Order entity
checkout tables
```

## 5. Tests

```text
CheckoutServiceTest
CouponValidatorTest
integration checkout tests
```

## 6. API Contract

```text
openapi.yaml
error response schema
receipt response schema
status codes
```

## 7. Security-Sensitive Areas

```text
payment token handling
coupon abuse controls
customer identifiers
logs
authorization checks
PII
```

## 8. Files Claude May Inspect

```text
all checkout module files
checkout tests
API docs
CLAUDE.md
README
architecture notes
```

## 9. Files Claude May Modify Only After Approval

```text
CheckoutService
CouponValidator
PricingCalculator
CheckoutServiceTest
CouponValidatorTest
openapi.yaml
```

## 10. Files Claude Must Not Modify

```text
payment secrets
production config
database migrations
auth filters
CI/CD gates
deployment scripts
```

## Why This Is Strong

This answer separates:

```text
read context
approved modification
forbidden modification
```

It also recognizes that checkout is not only a code path. It is a business-critical flow involving payment, pricing, API contracts, tests, and security.
