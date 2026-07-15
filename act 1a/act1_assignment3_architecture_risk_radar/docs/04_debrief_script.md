# Facilitator Debrief Script

Use this after participants complete the risk radar.

## Opening

The PR looked simple:

```text
Added discount support to checkout.
Updated tests.
Refactored pricing logic.
```

But the phrase “discount support” hides a large blast radius.

## Key Teaching Point

Discounts touch more than price calculation.

They may affect:

```text
tax
refunds
invoices
revenue recognition
fraud controls
customer eligibility
support workflows
audit logs
analytics
feature rollback
API contracts
```

## Suggested Talk Track

This is the difference between feature implementation and architecture review.

Claude Code can generate code that compiles and passes tests.

But the architect must ask:

```text
What system behavior changed?
Who else depends on this behavior?
What business rules are implied?
What controls are missing?
What evidence will we need later?
```

## Closing Line

Claude Code can implement the feature.

Architects must understand the blast radius.
