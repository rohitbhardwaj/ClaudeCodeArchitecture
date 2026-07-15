# File-Level vs System-Level Prompting

## File-Level Prompt

```text
Fix the bug in CheckoutService.java.
```

## Why This Is Risky

It assumes:

```text
the bug lives in one file
local code change is enough
related files do not matter
API contracts are unaffected
tests already protect behavior
security risks are obvious
```

Those assumptions are often false.

## System-Level Prompt

A system-level prompt says:

```text
Analyze the checkout failure before modifying files.
Inspect related code, tests, API contracts, and repository guidance.
Explain current behavior and possible root causes.
List risks and ask for approval before coding.
```

## What Changes?

| File-level prompting | System-level prompting |
|---|---|
| Starts with code change | Starts with investigation |
| Assumes one file | Maps related files |
| Optimizes locally | Protects system behavior |
| May ignore tests | Identifies tests first |
| May change public behavior | Preserves API contract |
| May miss security | Lists risks before coding |
| Fast but unsafe | Controlled and reviewable |

## Architect Principle

```text
Do not let a file name define the problem boundary.
```
