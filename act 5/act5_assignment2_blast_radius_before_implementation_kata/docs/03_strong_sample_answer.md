# Strong Sample Answer

| Impact area | Risk or consideration |
|---|---|
| User-visible behavior | Customers see discount accepted, rejected, expired, or unauthorized |
| API contract | Receipt may need discount fields and reason codes |
| Pricing | Subtotal, discount, total calculation may change |
| Tax | Tax basis may change depending on discount rules |
| Payment | Charged amount changes |
| Refunds | Refund amount must account for discount |
| Fraud/abuse | Coupon brute force, unauthorized use, replay |
| Data model | May need discountCode, discountAmount, promotionId |
| Analytics | Track accepted/rejected coupon events |
| Support | Need clear rejection reason |
| Observability | Log safe reason codes, not PII |
| Tests | Valid, invalid, expired, unauthorized, refund, tax, rollback |
| Rollback | Feature flag or config kill switch |
| Required approvals | Architecture, product, security, finance, QA |

## Strong Follow-Up Instruction

```text
Do not implement discount codes yet.

First return a blast-radius assessment covering:
user behavior, API, pricing, tax, payment, refunds, fraud, data, analytics, support, observability, tests, rollback, and approvals.

Then propose the smallest safe implementation plan and wait for approval.
```
