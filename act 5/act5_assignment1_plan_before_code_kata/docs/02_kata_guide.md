# Plan Before Code Kata Guide

## Why This Kata Matters

Most unsafe Claude Code workflows begin with a prompt that sounds normal:

```text
Fix the checkout bug.
```

But that prompt skips the architecture workflow.

It lets Claude move directly into editing before it has:

```text
read repo rules
inspected relevant files
identified root cause
understood behavior to preserve
identified tests
identified risks
waited for approval
```

## Kata Goal

Participants practice converting implementation-first requests into analysis-first prompts.

## Strong Pattern

```text
Analyze before modifying files.
Inspect repo context.
Return plan, tests, risks, and approval checkpoint.
Wait before coding.
```

## Fast Live Use

This kata can be run in 3 minutes:

```text
30 seconds — show weak prompt
90 seconds — participants rewrite
60 seconds — share strong answer
```
