# One-Page Handout — File-Level to System-Level Prompting

## Weak Prompt

```text
Fix the bug in CheckoutService.java.
```

## Problem

The bug may not live only in that file.

It may involve:

```text
controller
service
validator
calculator
payment client
tests
API contract
CLAUDE.md
```

## Upgraded Prompt Must Include

```text
Analyze first.
Do not modify files yet.
Identify related files.
Explain current behavior.
Identify possible root causes.
Identify tests.
List risks.
Ask for approval before coding.
```

## Key Constraint Examples

```text
Preserve public API behavior.
Do not change payment, pricing, tax, or coupon behavior without approval.
Do not remove or weaken tests.
Do not log sensitive data.
Wait for approval before modifying files.
```

## Key Lesson

```text
File-level prompts produce local fixes.
Architecture-level prompts protect system behavior.
```
