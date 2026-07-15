# Example Completed Context Map

Feature / bug: Checkout failure

## 1. Entry point

```text
CheckoutController
```

## 2. Core business logic

```text
CheckoutService
PricingCalculator
CouponValidator
```

## 3. External dependencies

```text
PaymentClient
InventoryClient
TaxService
```

## 4. Data/persistence

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

## 6. API contract

```text
openapi.yaml
error response schema
receipt response schema
status codes
```

## 7. Security-sensitive areas

```text
payment token handling
coupon abuse controls
customer identifiers
logs
authorization checks
PII
```

## 8. Files Claude may inspect

```text
all checkout module files
tests
API docs
CLAUDE.md
README
architecture notes
```

## 9. Files Claude may modify only after approval

```text
CheckoutService
CouponValidator
PricingCalculator
CheckoutServiceTest
CouponValidatorTest
openapi.yaml
```

## 10. Files Claude must not modify

```text
payment secrets
production config
database migrations
auth filters
CI/CD gates
deployment scripts
```

## Reflection

If we simply said “fix the bug,” Claude might miss API contracts, test expectations, security-sensitive logs, external dependencies, and approval boundaries.
