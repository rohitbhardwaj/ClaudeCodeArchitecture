# Facilitator Guide — Review the AI-Generated Diff Kata

## Learning Objective

Participants practice quickly identifying hidden risks in a Claude-generated diff.

## Setup Script

Say:

```text
Claude generated a checkout bug fix.
It looks like it fixed something, but your job is to review it like an architect.
Look for architecture, API, security, tests, rollback, and approvals.
```

## 4-Minute Live Version

| Segment | Time |
|---|---:|
| Show diff summary | 30 sec |
| Participants review checklist | 90 sec |
| Participants choose decision | 30 sec |
| Show strong rationale | 60 sec |
| Show safer response | 30 sec |

## 10-Minute Workshop Version

| Segment | Time |
|---|---:|
| Inspect bad diff | 3 min |
| Fill worksheet | 3 min |
| Pair compare | 2 min |
| Debrief | 2 min |

## Facilitation Prompts

Ask:

```text
What boundary did Claude cross?
What API behavior changed?
What data is unsafe to log?
What test was removed?
Are failure paths covered?
What rollback is missing?
Who should approve?
```

## Strong Closing Line

Reviewing Claude’s diff is not just code review; it is architecture, safety, and governance review.
