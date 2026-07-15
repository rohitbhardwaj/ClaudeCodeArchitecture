# Impact Area Cards

## User-Visible Behavior

Risk:

```text
Customers see discount accepted, rejected, expired, or unauthorized.
```

## API Contract

Risk:

```text
Receipt may need discount fields and reason codes.
```

## Pricing

Risk:

```text
Subtotal, discount, and total calculation may change.
```

## Tax

Risk:

```text
Tax basis may change depending on discount rules.
```

## Payment

Risk:

```text
Charged amount changes.
```

## Refunds

Risk:

```text
Refund amount must account for discount.
```

## Fraud/Abuse

Risk:

```text
Coupon brute force, unauthorized use, replay.
```

## Data Model

Risk:

```text
May need discountCode, discountAmount, promotionId.
```

## Analytics

Risk:

```text
Track accepted and rejected coupon events.
```

## Support

Risk:

```text
Need clear rejection reason.
```

## Observability

Risk:

```text
Log safe reason codes, not PII.
```

## Tests

Risk:

```text
Valid, invalid, expired, unauthorized, refund, tax, rollback.
```

## Rollback

Risk:

```text
Need feature flag or config kill switch.
```

## Required Approvals

Risk:

```text
Architecture, product, security, finance, QA.
```
