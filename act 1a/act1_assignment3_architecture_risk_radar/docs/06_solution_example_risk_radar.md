# Example Completed Risk Radar

Feature: Discount support in checkout

## 1. Behavior Risk

Discount changes total calculation and tax calculation. Tax is now calculated after discount. This may or may not be correct depending on jurisdiction and business rules.

## 2. API Compatibility Risk

Receipt now includes discount amount and may change the meaning of total. Existing consumers may not understand the new fields or calculation semantics.

## 3. Data Model Risk

Discount code and discount amount are not persisted on the order. Refunds, support, audits, and finance cannot reconstruct the pricing decision.

## 4. Security Risk

Any customer can use `VIP50` or `SAVE10`. There are no expiration, eligibility, usage-limit, authorization, or abuse controls.

## 5. Test Quality Risk

Tests cover only the happy path. There are no invalid, expired, unauthorized, rollback, audit, refund, or tax-semantics tests.

## 6. Coupling Risk

Discount logic is duplicated inside checkout instead of using a promotion or pricing policy boundary.

## 7. Observability Risk

Discount decisions are not logged or traced. Support cannot tell why a discount was applied or rejected.

## 8. Rollback Risk

There is no feature flag. A bad discount rollout requires redeploying or reverting checkout code.

## 9. Human Approval Required

Architecture, product, security, finance, QA, and support should review before release.

## 10. Decision

Reject and restart with a plan-first prompt.

Alternative: split into smaller PRs only after creating characterization tests and defining pricing/promotion boundaries.
