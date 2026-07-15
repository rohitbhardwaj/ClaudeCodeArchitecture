# Debrief Script

Use this after participants complete the simulation.

## Opening

Notice what happened.

The original prompt sounded harmless:

```text
Clean up the OrderService and add tests.
```

But to an agent, that is a large authority grant.

It does not say:

- What behavior must remain unchanged
- Which architecture boundaries matter
- Which tests must not be removed
- Which security rules are non-negotiable
- When to stop and ask for approval

## Teaching Point

This is why vibe coding feels productive but can be dangerous.

The refactor looks cleaner. The tests pass. The code is shorter.

But:

- Authentication disappeared
- Payment tokens entered logs
- Error contracts changed
- Validation was weakened
- Tests were removed or softened

## Core Lesson

The issue is not that Claude wrote bad code.

The issue is that the prompt gave Claude authority without boundaries.

A governed prompt would have said:

```text
Preserve behavior.
Preserve authentication.
Preserve error codes.
Do not weaken tests.
Do not log secrets.
Propose a plan first.
Wait for approval before changing files.
```

## Closing Line

Green tests tell you the code passed something.

Architecture review tells you whether it preserved the system.
