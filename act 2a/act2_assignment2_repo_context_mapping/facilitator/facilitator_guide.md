# Facilitator Guide — Repo Context Mapping Simulation

## Learning Objective

Participants learn that repo-aware work starts with a context map, not code generation.

## Setup Script

Say:

```text
A weak prompt says: Fix the checkout bug.
An architect prompt says: First map the checkout context.
```

## Recommended Timing

### Conference Version

| Segment | Time |
|---|---:|
| Explain weak prompt | 1 min |
| Individual context map | 5 min |
| Pair compare | 3 min |
| Debrief | 4 min |

Total: 13 minutes

### Workshop Version

| Segment | Time |
|---|---:|
| Explain scenario | 3 min |
| Individual map | 8 min |
| Group compare | 8 min |
| Prompt rewrite | 7 min |
| Debrief | 5 min |

Total: 31 minutes

## Facilitation Prompts

Ask:

```text
Where does checkout start?
Where does pricing happen?
Where does coupon validation happen?
What external systems are involved?
Which tests protect behavior?
Which API contracts could break?
What should Claude not touch?
```

## Common Mistake

Participants may only list production code files.

Push them to include:

```text
tests
API contracts
CLAUDE.md
logs
security-sensitive areas
data persistence
external services
```

## Debrief Focus

The key shift is from:

```text
local bug fixing
```

to:

```text
context-aware investigation
```

## Strong Closing Line

Repo-aware agents require repo-aware architecture controls.
