# Expected Architect Findings

Participants should ideally find the following risks.

## 1. Behavior Risk

The discount is applied before tax, but the original behavior may have expected tax to be calculated on the pre-discount subtotal depending on business and jurisdiction rules.

Architect question:

```text
Did discounts change tax calculation?
```

## 2. API Compatibility Risk

The public `Receipt` shape was changed.

Original fields included:

```text
subtotal
tax
total
```

The new version adds `discountAmount` and changes total calculation semantics.

Architect question:

```text
Will existing clients break or misinterpret totals?
```

## 3. Data Model Risk

The discount code is accepted on the request but not persisted on the order record.

Architect question:

```text
Can refunds, support, audits, and revenue reconciliation reconstruct why the customer paid less?
```

## 4. Security Risk

Discount codes are accepted from the client without authorization, validation, expiration checks, customer eligibility checks, or abuse controls.

Architect question:

```text
Did the implementation bypass promotion authorization and fraud controls?
```

## 5. Test Quality Risk

The test only covers the happy path.

Missing tests include:

```text
invalid discount
expired discount
unauthorized discount
discount larger than subtotal
tax calculation
refund calculation
audit logging
feature disabled
```

Architect question:

```text
Did tests only prove that the new code runs?
```

## 6. Coupling Risk

Pricing logic is now directly aware of discount rules inside the checkout module.

Architect question:

```text
Did we duplicate pricing or promotion logic instead of using the promotion boundary?
```

## 7. Observability Risk

Discount decisions are not logged or traced.

Architect question:

```text
Can support or finance explain why a discount was applied?
```

## 8. Rollback Risk

No feature flag exists.

Architect question:

```text
Can we disable discounts without redeploying or reverting the whole checkout change?
```

## 9. Human Approval Required

Human approval should be required from:

```text
Architecture
Product
Security
Finance or revenue operations
QA
```

## 10. Recommended Decision

Best decision:

```text
D. Reject and restart with a plan-first prompt
```

Acceptable alternative:

```text
C. Split into smaller PRs
```

Because the implementation changes pricing behavior, introduces fraud risk, lacks auditability, and has weak test coverage, this should not be approved as-is.
