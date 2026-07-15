# Facilitator Guide — Blast Radius Before Implementation Kata

## Learning Objective

Participants practice identifying blast radius before Claude implements a checkout discount feature.

## Setup Script

Say:

```text
The request sounds simple: Add promotional discount codes during checkout.
But discount codes touch money, tax, payment, fraud, data, analytics, support, and rollback.
Before Claude writes code, architects must map the blast radius.
```

## 3-Minute Live Version

| Segment | Time |
|---|---:|
| Show feature request | 30 sec |
| Participants list impact areas | 90 sec |
| Show strong sample answer | 60 sec |

## 8-Minute Workshop Version

| Segment | Time |
|---|---:|
| Explain risk | 1 min |
| Fill worksheet | 3 min |
| Pair compare | 2 min |
| Debrief | 2 min |

## Facilitation Prompts

Ask:

```text
What changes for the customer?
What changes in the API?
What changes in pricing/tax/payment?
What changes in refunds?
How could this be abused?
What data must be stored?
How do we roll this back?
Who must approve?
```

## Strong Closing Line

Before Claude changes code, architects must understand blast radius.
