# CLAUDE.md Rules to Add After the Incident

Copy or adapt these into CLAUDE.md.

```markdown
## Production Behavior Protection

Claude must not change production behavior unless explicitly requested and approved.

High-risk behavior includes:
- checkout behavior
- coupon and discount validation
- pricing
- tax
- payment
- refunds
- authentication
- authorization
- public API responses
- error codes
- logging
- audit events
- data migrations

## Analyze-First Requirement

Before modifying high-risk areas, Claude must:

1. Summarize current behavior.
2. Identify impacted files.
3. List user-visible and system-visible behavior that must remain unchanged.
4. Identify risks.
5. Propose a small-step plan.
6. Identify tests to add or update.
7. Wait for approval.

## Test Protection

Claude must not:
- remove tests silently
- weaken assertions
- update tests merely to match changed behavior
- remove edge-case coverage without explanation and approval

## Logging and PII

Claude must not log:
- email addresses
- partial email addresses
- payment tokens
- secrets
- passwords
- API keys
- customer PII
- sensitive identifiers

Use approved correlation IDs and audit fields instead.

## Review Requirements

Changes touching checkout, coupon, payment, pricing, tax, refund, auth, public API, or logging require human review from appropriate owners.
```
