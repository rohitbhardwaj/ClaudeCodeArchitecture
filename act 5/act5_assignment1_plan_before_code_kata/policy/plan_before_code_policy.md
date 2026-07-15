# Plan Before Code Policy

## Purpose

Prevent implementation-first Claude Code usage.

## Policy

For production-impacting bugs and changes, Claude must analyze before modifying files.

## Required Prompt Elements

```text
do not edit files yet
inspect repo context
identify likely root cause
list behavior to preserve
propose small implementation plan
identify tests needed
identify risks
wait for approval
```

## Key Rule

```text
No analysis, no code.
```
