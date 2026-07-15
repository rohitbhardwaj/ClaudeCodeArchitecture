# Facilitator Guide — Task Boundary Classification

## Learning Objective

Participants learn that Claude Code requires task-specific authority levels.

## Setup Script

Say:

```text
Claude Code should not have one permission level.
Explaining checkout is not the same as changing payment retry logic.
Generating tests is not the same as deleting tests.
Summarizing a PR is not the same as bypassing review.
```

## Timing

### Conference Version

| Segment | Time |
|---|---:|
| Explain categories | 2 min |
| Individual classification | 6 min |
| Pair compare | 3 min |
| Debrief | 4 min |

Total: 15 minutes

### Workshop Version

| Segment | Time |
|---|---:|
| Explain categories | 4 min |
| Individual classification | 8 min |
| Group debate | 10 min |
| Reflection | 5 min |
| Debrief | 5 min |

Total: 32 minutes

## Facilitation Prompts

Ask:

```text
Which task was hardest to classify?
Which task depends most on module context?
Which task is safe only if reviewed?
Which task should be forbidden even in emergencies?
Which one would your team misclassify today?
```

## Watch For

Participants may classify “delete failing tests” as needs approval.

Clarify:

```text
Deleting tests silently is not allowed.
Removing or replacing tests may be possible only with explicit approval, explanation, and replacement coverage.
```

Participants may classify “refactor private helper” as always safe.

Clarify:

```text
Private helper in payment or auth may still have high blast radius.
```

## Strong Closing Point

Claude Code authority should be proportional to the blast radius of the task.
