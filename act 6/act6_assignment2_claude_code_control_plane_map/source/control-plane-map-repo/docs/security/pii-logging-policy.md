# PII Logging Policy

## Never Log

```text
customer email
payment token
password
secret
access token
full address
```

## Use Instead

```text
correlationId
reasonCode
eventId
```

## Enforcement

```text
security review
PII scan in CI
PR checklist
```
