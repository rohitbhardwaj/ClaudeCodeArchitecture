# Facilitator Guide — Prompt Upgrade: File-Level to System-Level

## Learning Objective

Participants learn to upgrade vague file-level prompts into system-level investigation prompts.

## Setup Script

Say:

```text
The developer prompt is: Fix the bug in CheckoutService.java.
That sounds clear, but it is actually dangerous.
The file name is not the system boundary.
```

## Timing

### Conference Version

| Segment | Time |
|---|---:|
| Explain weak prompt | 2 min |
| Individual rewrite | 6 min |
| Pair discussion | 4 min |
| Debrief | 4 min |

Total: 16 minutes

### Workshop Version

| Segment | Time |
|---|---:|
| Explain source simulation | 5 min |
| Individual rewrite | 8 min |
| Pair discussion | 8 min |
| Group share | 6 min |
| Debrief | 5 min |

Total: 32 minutes

## Facilitation Prompts

Ask:

```text
What did the file-level prompt assume?
What files did you add to the investigation?
What behavior must be preserved?
What tests should Claude inspect?
What risks should Claude list?
What should require approval?
```

## Common Mistake

Participants may only add more files but forget approval.

Remind them:

```text
System-level prompting is not just broader context.
It is broader context plus constraints plus approval boundaries.
```

## Strong Closing Line

File-level prompts produce local fixes. Architecture-level prompts protect system behavior.
