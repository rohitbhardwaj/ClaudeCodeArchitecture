# Role Card — Security Reviewer

## Your Perspective

You are responsible for protecting customer data, logs, secrets, validation, and abuse controls.

## Your Investigation Focus

Look for:

```text
PII exposure
unsafe logging
validation changes
coupon abuse
missing security review
lack of audit controls
```

## Evidence

Logs contain entries like:

```text
customerEmail=ro***@example.com coupon=SUMMER25 reason=invalid coupon
```

## What You Should Notice

```text
partial customer email is still personal data in many contexts
coupon validation changed without abuse analysis
valid coupon rejection may cause customer harm
reason codes are generic and may reduce auditability
no PII logging scanner caught the change
no security reviewer was required
```

## Your Role Task

Answer:

```text
1. What data exposure happened?
2. What validation risk was introduced?
3. What security gate was missing?
4. What should logging have done instead?
5. What rule should be added to CLAUDE.md?
```

## Recommended Logging Rule

```text
Do not log raw or partial customer email, payment tokens, secrets, or sensitive identifiers. Use correlation IDs and approved audit fields instead.
```
