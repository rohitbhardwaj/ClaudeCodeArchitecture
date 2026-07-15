# Facilitator Guide — Assignment 3

## Learning Objective

Participants learn that adding a feature through Claude Code requires architecture blast-radius analysis, not just code review.

## Setup

Tell participants:

```text
This is a simulated PR. Everything compiles. Tests pass.
Your job is to review it as the architect.
```

## Timing

| Segment | Time |
|---|---:|
| Scenario setup | 3 min |
| Individual review | 10 min |
| Fill risk radar | 8 min |
| Pair discussion | 5 min |
| Debrief | 7 min |

## What to Push Participants Toward

Do not let the discussion stay at code cleanliness.

Push into:

```text
tax behavior
refund behavior
discount authorization
auditability
feature flags
API compatibility
analytics
support workflows
fraud controls
test quality
```

## Strong Participant Answers

Strong answers should mention that a discount feature touches:

```text
Checkout
Pricing
Tax
Promotion
Payment
Refunds
Receipts
Analytics
Fraud
Support
Finance
```

## Recommended Final Decision

The best final decision is:

```text
D. Reject and restart with a plan-first prompt
```

The second-best decision is:

```text
C. Split into smaller PRs
```

## Debrief Question

Ask:

```text
What did Claude implement correctly from a coding perspective but incorrectly from an architecture perspective?
```
