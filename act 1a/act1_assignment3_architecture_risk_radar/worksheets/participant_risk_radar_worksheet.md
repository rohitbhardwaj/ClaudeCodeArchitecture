# Participant Worksheet — Architecture Risk Radar

## Scenario

Claude Code implemented discount support in checkout.

The code compiles.

The tests pass.

You are reviewing the PR before production release.

## Risk Radar

Feature: Discount support in checkout

| Risk Area | Your Finding |
|---|---|
| 1. Behavior risk |  |
| 2. API compatibility risk |  |
| 3. Data model risk |  |
| 4. Security risk |  |
| 5. Test quality risk |  |
| 6. Coupling risk |  |
| 7. Observability risk |  |
| 8. Rollback risk |  |
| 9. Human approval required |  |
| 10. Decision: approve / revise / split / reject |  |

## Guiding Questions

### Behavior Risk

Did discounts change tax calculation?

Did discounts affect refunds?

Did the order total mean the same thing before and after this PR?

### API Compatibility Risk

Did any response fields change?

Will existing clients still understand the receipt?

Are error codes and status meanings preserved?

### Data Model Risk

Is discount information stored for support, refunds, audits, and analytics?

Can finance reconstruct how the final price was calculated?

### Security Risk

Can any user apply any discount code?

Are discount codes validated, expired, scoped, and authorized?

Could this be abused?

### Test Quality Risk

Do tests cover failure paths?

Did tests only cover the happy path?

Are old behaviors protected by characterization tests?

### Coupling Risk

Did checkout duplicate promotion logic?

Is pricing logic now mixed with discount policy?

### Observability Risk

Are discount decisions logged?

Can support explain why a discount was accepted or rejected?

### Rollback Risk

Can discounts be disabled quickly?

Is there a feature flag?

Can the change be rolled back safely?

## Reflection Question

What part of the original Claude task gave the agent too much freedom?
