# Facilitator Guide — Act 2 Assignment 1

## Learning Objective

Participants learn to stop thinking of Claude Code as only autocomplete and start thinking of it as a repo-aware engineering participant.

## Setup Script

Say:

```text
In Act 1, we saw the danger of ungoverned AI-generated change.
In Act 2, we ask a deeper question:
What kind of engineering actor is Claude Code becoming?
```

Then introduce the three levels:

```text
Level 1 — Code helper
Level 2 — Repo-aware assistant
Level 3 — Engineering workflow agent
```

## Recommended Timing

### Conference Version

| Segment | Time |
|---|---:|
| Explain levels | 3 min |
| Individual classification | 5 min |
| Pair discussion | 3 min |
| Debrief | 4 min |

Total: 15 minutes

### Workshop Version

| Segment | Time |
|---|---:|
| Explain levels | 5 min |
| Individual classification | 8 min |
| Group classification debate | 10 min |
| Team reflection | 8 min |
| Debrief | 5 min |

Total: 36 minutes

## Facilitation Prompts

Ask:

```text
Which use case did you classify differently from your partner?
Which tasks move from coding help into workflow participation?
Which Level 3 task would require the strongest governance?
Where does your team still use Level 1 prompts for Level 2 problems?
```

## Common Misclassification

Participants may classify “generate tests” as Level 1.

Push them:

```text
If tests must preserve existing behavior across files, this is Level 2.
If tests become part of PR quality gates, this becomes Level 3.
```

## Strong Debrief Point

Claude Code’s risk is not static.

Risk grows as scope grows:

```text
function → file → module → repo → workflow → release
```
