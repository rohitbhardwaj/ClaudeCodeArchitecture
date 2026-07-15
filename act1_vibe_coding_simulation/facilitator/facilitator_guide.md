# Facilitator Guide

## Recommended Timing

| Activity | Time |
|---|---:|
| Explain scenario | 2 minutes |
| Individual review | 5 minutes |
| Pair discussion | 4 minutes |
| Group share | 4 minutes |
| Debrief | 5 minutes |

Total: approximately 20 minutes.

## How to Run the Exercise

1. Show the original `OrderService`.
2. Show the Claude-generated refactor.
3. Tell participants: **all tests are green**.
4. Ask them to review like architects, not syntax reviewers.
5. Have them fill out the review sheet.
6. Ask each group for their PR decision.
7. Debrief using `04_debrief_script.md`.

## What to Watch For

Participants may initially say:

```text
The refactor looks cleaner.
```

Push them to ask:

```text
Cleaner compared to what contract?
Cleaner with what behavior preserved?
Cleaner with what security guarantees?
Cleaner with what test protection?
```

## Best Teaching Moment

The test suite still passes because the tests were changed to match the new behavior.

This is the key insight:

> AI-generated tests can accidentally confirm AI-generated regressions.

## Expected Final Decision

The strongest answer is:

```text
D. Reject and restart with a plan-first prompt
```

Reason:

- Authentication behavior was removed.
- Payment tokens are logged.
- Public error contracts changed.
- Validation was weakened.
- Tests were removed or softened.

## Strong Closing Line

Claude Code should move fast.

Architecture decides where it is allowed to move.
