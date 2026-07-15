# Expected Findings

Participants should notice that the weak prompt hides the system context.

## Weak Prompt

```text
Fix the checkout bug.
```

## What This Prompt Misses

```text
entry point
business logic location
external dependencies
data persistence
tests
API contract
security-sensitive fields
files safe to inspect
files requiring approval
files forbidden to modify
```

## Key Risks

### 1. Local Fix Risk

Claude may change only `CheckoutService` without understanding controller, API, tests, or downstream dependencies.

### 2. API Contract Risk

Claude may change error codes, response fields, or status codes without approval.

### 3. Payment Risk

Claude may change payment amount, retry behavior, or token handling.

### 4. Tax/Pricing Risk

Claude may alter pricing or tax behavior while fixing checkout.

### 5. Security Risk

Claude may log payment tokens, customer identifiers, or coupon details.

### 6. Test Risk

Claude may update tests to match new behavior instead of preserving current behavior.

### 7. Data Risk

Claude may change order persistence or schema-related assumptions.

### 8. Reviewability Risk

Claude may modify too many files in one pass.

## Best Architect Response

Before coding, require Claude to:

```text
inspect context
summarize current flow
identify impacted files
list risks
propose a small-step plan
wait for approval
```
