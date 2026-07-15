# Expected Findings from Source Repo

The source repo intentionally includes multiple areas affected by promotional discounts.

Participants should identify:

```text
api/openapi.yaml — API contract/receipt fields
PricingCalculator.java — subtotal, discount, total
TaxCalculator.java — tax basis
PaymentClient.java — charged amount
RefundCalculator.java — refund amount
CouponFraudPolicy.java — brute force/unauthorized use
db/migration — data model change
AnalyticsEventPublisher.java — accepted/rejected coupon events
SupportReasonMapper.java — support-facing rejection reason
SafeLogger.java — safe reason-code logging
FeatureFlags.java — rollback/kill switch
CheckoutDiscountTest.java — tests needed
CODEOWNERS — approval owners
```

## Correct Approach

```text
Map impact first.
Do not implement yet.
Ask for approval before touching pricing, tax, payment, refunds, API, or data model.
```
