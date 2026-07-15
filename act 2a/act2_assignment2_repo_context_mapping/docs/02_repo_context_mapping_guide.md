# Repo Context Mapping Guide

## What Is a Repo Context Map?

A repo context map identifies the files, boundaries, risks, and constraints that matter before Claude Code modifies a repository.

It turns a vague request like:

```text
Fix the checkout bug.
```

into a controlled investigation.

## Why Architects Should Use It

A checkout bug may involve more than code correctness.

It may affect:

```text
customer-facing behavior
public API contracts
payment amount
tax calculation
coupon validation
order persistence
logs and PII
support reason codes
test coverage
rollback safety
```

## What the Map Protects

The context map protects against:

```text
local fixes that break system behavior
changes to public APIs
unapproved payment/pricing changes
test weakening
security-sensitive logging
hidden coupling
large unreviewable changes
```

## Context Map Fields

### 1. Entry Point

Where the request enters the system.

Examples:

```text
CheckoutController
GraphQL resolver
REST endpoint
message consumer
scheduled job
```

### 2. Core Business Logic

Where business decisions happen.

Examples:

```text
CheckoutService
PricingCalculator
CouponValidator
TaxCalculator
```

### 3. External Dependencies

Services or clients outside the module.

Examples:

```text
PaymentClient
InventoryClient
TaxService
PromotionService
```

### 4. Data/Persistence

Where state is stored or retrieved.

Examples:

```text
OrderRepository
Order entity
checkout tables
migrations
```

### 5. Tests

Tests that should protect behavior.

Examples:

```text
CheckoutServiceTest
CouponValidatorTest
integration checkout tests
contract tests
```

### 6. API Contract

Public interfaces that clients rely on.

Examples:

```text
openapi.yaml
error response schema
receipt response schema
status codes
```

### 7. Security-Sensitive Areas

Places where mistakes can cause risk.

Examples:

```text
payment tokens
coupon abuse
customer identifiers
logs
authorization checks
PII
```

### 8. Files Claude May Inspect

Files Claude can read to understand context.

### 9. Files Claude May Modify Only After Approval

Files Claude can modify only after a plan and human approval.

### 10. Files Claude Must Not Modify

Files that are forbidden for the task.

Examples:

```text
production secrets
deployment config
CI/CD gates
auth filters
data migrations
```
