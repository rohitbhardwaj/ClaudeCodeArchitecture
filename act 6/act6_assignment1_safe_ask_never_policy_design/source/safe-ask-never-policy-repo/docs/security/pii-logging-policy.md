# PII Logging Policy

## Never Log

```text
customer email
payment token
password
secret
access token
government ID
full address
```

## Use Instead

```text
correlationId
safe reasonCode
anonymous eventId
```

## Claude Rule

Claude must never add PII logging.
