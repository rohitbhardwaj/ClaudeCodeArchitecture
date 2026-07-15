# Assignment Instructions

## Scenario

A developer asks Claude Code:

```text
Fix the checkout bug.
```

This is too broad and implementation-first.

## Architect Task

Rewrite the request into a plan-first governed prompt.

Your prompt should include:

```text
Do not edit files yet
Inspect repo context
Identify likely root cause
List behavior to preserve
Propose small implementation plan
Identify tests needed
Identify risks
Wait for approval
```

## Key Lesson

```text
The first Claude Code prompt should often be analysis, not implementation.
```
