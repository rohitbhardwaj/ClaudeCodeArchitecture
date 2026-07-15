# Facilitator Guide — Production Incident Role Play

## Learning Objective

Participants experience how different roles see the same AI-generated change differently.

## Setup

Assign participants to four roles:

```text
Developer
Architect
Security reviewer
Product owner
```

Give each participant the relevant role card.

## Timing

| Segment | Time |
|---|---:|
| Explain incident | 3 min |
| Read role cards | 4 min |
| Review evidence | 8 min |
| Role discussion | 10 min |
| Fill incident review | 8 min |
| Group share-out | 5 min |
| Debrief | 5 min |

## Facilitator Prompts

Ask the developer:

```text
What did the original prompt fail to constrain?
```

Ask the architect:

```text
What behavior changed under the label of cleanup?
```

Ask the security reviewer:

```text
What logging or validation issue should have blocked the PR?
```

Ask the product owner:

```text
How did this affect customers and support?
```

## Watch For

Strong groups should identify:

```text
case-sensitive coupon regression
missing campaign fallback
generic rejection reason
partial email in logs
tests updated to match new behavior
missing characterization tests
missing product/security/architecture approval
```

## Final Teaching Line

The issue was not Claude Code.

The issue was that Claude Code operated without enough boundaries, tests, and review gates.
