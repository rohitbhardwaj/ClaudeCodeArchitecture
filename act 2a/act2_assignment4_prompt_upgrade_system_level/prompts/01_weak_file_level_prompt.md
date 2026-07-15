# Weak File-Level Prompt

```text
Fix the bug in CheckoutService.java.
```

## Why It Is Weak

It does not ask Claude to:

```text
analyze first
inspect related files
identify current behavior
find root causes
review tests
protect API contracts
list risks
ask approval before coding
```

## Likely Failure Mode

Claude may patch `CheckoutService.java` locally while missing the real root cause in:

```text
CouponValidator.java
CheckoutController.java
openapi.yaml
tests
CLAUDE.md
```
