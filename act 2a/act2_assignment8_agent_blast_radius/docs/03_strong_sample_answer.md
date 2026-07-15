# Strong Sample Answer

Change: Add promotional discount codes

## 1. User-visible behavior

```text
Checkout may show discounted total or coupon rejection.
Customers may see coupon accepted, coupon rejected, expired coupon, or eligibility messages.
```

## 2. API contract

```text
Receipt may need discount fields and reason codes.
Response may need discountCode, discountAmount, promotionId, and rejectionReason.
```

## 3. Pricing

```text
Discount affects subtotal and total calculation.
Need rules for stacking, rounding, minimum order, excluded items, and max discount.
```

## 4. Tax

```text
Tax basis may change.
Need to know whether tax applies before or after discount.
```

## 5. Payment

```text
Payment amount changes.
Payment authorization and capture must use discounted total.
```

## 6. Refunds

```text
Refund amount must account for discounts.
Partial refunds need discount proration rules.
```

## 7. Fraud/abuse

```text
Coupon brute force and unauthorized use.
Need eligibility, rate limits, one-time use, and abuse monitoring.
```

## 8. Data model

```text
Need discountCode, discountAmount, promotionId.
May need redemption records and indexes.
```

## 9. Analytics

```text
Track accepted/rejected discounts.
Track campaign conversion, cart abandonment, and rejection reasons.
```

## 10. Support

```text
Support needs rejection reason.
Support needs visibility into applied discount and promotion eligibility.
```

## 11. Observability

```text
Log coupon decisions safely.
Use correlation IDs and approved reason codes. Do not log PII or payment tokens.
```

## 12. Tests

```text
Happy path, invalid, expired, unauthorized, refund, tax, feature flag.
Also test rounding, stacking, minimum order, and API contract.
```

## 13. Rollback

```text
Feature flag required.
Need safe disablement and monitoring for coupon rejection and checkout error rates.
```

## 14. Required approvals

```text
Architecture, product, security, finance, QA.
Support and data/analytics may also need review.
```
