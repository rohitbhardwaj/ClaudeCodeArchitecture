# Facilitator Guide — Agent Blast Radius Exercise

## Learning Objective

Participants learn to estimate the blast radius of a Claude Code change before allowing implementation.

## Setup Script

Say:

```text
The request sounds simple: Add support for promotional discount codes during checkout.
But checkout is a business-critical flow.
Before Claude changes code, architects must ask: What is the blast radius?
```

## Timing

### Conference Version

| Segment | Time |
|---|---:|
| Explain change request | 2 min |
| Individual blast-radius map | 8 min |
| Pair compare | 4 min |
| Debrief | 4 min |

Total: 18 minutes

### Workshop Version

| Segment | Time |
|---|---:|
| Explain scenario | 4 min |
| Individual map | 10 min |
| Risk-card discussion | 10 min |
| Approval matrix | 6 min |
| Debrief | 5 min |

Total: 35 minutes

## Facilitation Prompts

Ask:

```text
What does the customer see?
What changes in the API?
What happens to tax?
What happens to refunds?
How could this be abused?
What data must be stored?
How will support explain failures?
How do we roll back?
Who must approve?
```

## Common Mistake

Participants may focus only on pricing.

Push them toward:

```text
tax
refunds
fraud
support
analytics
observability
rollback
approvals
```

## Strong Closing Line

Before Claude changes code, architects must understand the blast radius.
