# Expected Findings

Participants should discover that promotional discount codes are not a small isolated checkout change.

## Major Blast Radius Areas

```text
pricing
tax
payment
refunds
fraud
analytics
support
observability
API contract
data model
tests
rollback
approvals
```

## Common Missing Areas

Participants often miss:

```text
tax basis
refund proration
fraud/abuse
analytics attribution
support reason codes
feature flag rollback
data model retention
observability without PII
```

## Strong Architect Answer

A strong answer should not approve implementation immediately.

It should require Claude to:

```text
analyze blast radius
identify impacted files
list behavior changes
propose data/API changes
identify tests
identify approvals
wait for approval before coding
```

## Key Takeaway

The more business-critical the flow, the more dangerous it is to let Claude implement from a narrow prompt.
