# Facilitator Guide — Assignment 4

## Learning Objective

Participants learn to define practical boundaries for Claude Code in production repositories.

## Setup Script

Say:

```text
Claude Code can move quickly across a repo.
That is exactly why boundaries matter.
In this exercise, you are not writing code.
You are designing the control model.
```

## Activity Flow

| Segment | Time |
|---|---:|
| Explain scenario | 2 min |
| Individual boundary table | 7 min |
| Small-group discussion | 6 min |
| Risk-card debate | 8 min |
| Group share-out | 5 min |
| Debrief | 5 min |

## Facilitation Tips

Push participants beyond obvious items.

Ask:

```text
What about data migrations?
What about logging?
What about public API error codes?
What about payment retries?
What about CI/CD configuration?
What about dependency upgrades?
What about generated tests?
```

## Common Mistake

Participants often put too much in “may do.”

Correct by asking:

```text
Could this create customer, security, compliance, financial, or rollback risk?
```

If yes, it likely belongs in “must ask first.”

## Strong Takeaway

The goal is not to make Claude Code weak.

The goal is to make Claude Code safe enough to scale across a team.
