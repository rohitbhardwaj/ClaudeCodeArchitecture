# Example Completed Blast Radius

Change: Add promotional discount codes

| Area | Impact |
|---|---|
| User-visible behavior | Checkout may show discounted total or coupon rejection. |
| API contract | Receipt may need discount fields and reason codes. |
| Pricing | Discount affects subtotal and total calculation. |
| Tax | Tax basis may change. |
| Payment | Payment amount changes. |
| Refunds | Refund amount must account for discounts. |
| Fraud/abuse | Coupon brute force and unauthorized use. |
| Data model | Need discountCode, discountAmount, promotionId. |
| Analytics | Track accepted/rejected discounts. |
| Support | Support needs rejection reason. |
| Observability | Log coupon decisions safely. |
| Tests | Happy path, invalid, expired, unauthorized, refund, tax, feature flag. |
| Rollback | Feature flag required. |
| Required approvals | Architecture, product, security, finance, QA. |

## Strong Reflection

```text
Our team would most likely miss refund and tax impact because discount features are often treated as checkout UI changes rather than financial behavior changes.
```

## Strong CLAUDE.md Rule

```markdown
Before implementing promotional discounts, Claude must analyze blast radius across user behavior, API, pricing, tax, payment, refunds, fraud, data model, analytics, support, observability, tests, rollback, and approvals. Claude must wait for approval before coding.
```
