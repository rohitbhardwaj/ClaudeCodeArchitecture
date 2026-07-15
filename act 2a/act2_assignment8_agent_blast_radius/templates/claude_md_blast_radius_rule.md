# CLAUDE.md Rule — Blast Radius Before Implementation

Copy or adapt this into CLAUDE.md.

```markdown
## Blast Radius Requirement

For business-critical changes, Claude must analyze blast radius before coding.

Business-critical areas include:
- checkout
- pricing
- tax
- payment
- refunds
- promotions
- authentication
- authorization
- public APIs
- data migrations

Before implementation, Claude must document impact across:

1. User-visible behavior
2. API contract
3. Pricing
4. Tax
5. Payment
6. Refunds
7. Fraud/abuse
8. Data model
9. Analytics
10. Support
11. Observability
12. Tests
13. Rollback
14. Required approvals

Claude must not modify files until the blast-radius analysis and implementation plan are approved.
```
