# Act 1 Assignment 3 — Architecture Risk Radar

## Theme

Claude Code can implement a feature. Architects must understand the blast radius.

## Scenario

Claude Code produced a successful implementation of a new discount feature.

Everything compiles.

The pull request summary says:

```text
Added discount support to checkout.
Updated tests.
Refactored pricing logic.
```

Your role is the architect reviewing this change before it goes to production.

## Architect Task

Create an **Architecture Risk Radar** for the discount feature.

You are not only checking whether the code compiles. You are checking whether the feature preserved behavior, API contracts, tax calculations, refund behavior, authorization, observability, rollback safety, and test quality.

## Risk Radar Template

```text
Feature: Discount support in checkout

1. Behavior risk:
2. API compatibility risk:
3. Data model risk:
4. Security risk:
5. Test quality risk:
6. Coupling risk:
7. Observability risk:
8. Rollback risk:
9. Human approval required:
10. Decision: approve / revise / split / reject
```

## Recommended Flow

| Step | Activity | Time |
|---|---:|---:|
| 1 | Read scenario and PR summary | 3 min |
| 2 | Review flawed implementation | 10 min |
| 3 | Fill out risk radar | 8 min |
| 4 | Pair discussion | 5 min |
| 5 | Facilitator debrief | 7 min |

## Core Lesson

A feature can be “successfully implemented” and still be unsafe to merge.

Claude Code may generate working code, but architects must verify the full blast radius.
