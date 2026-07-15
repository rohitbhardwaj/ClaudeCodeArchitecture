# Review the AI-Generated Diff Kata Guide

## Why This Kata Matters

Claude can generate diffs that appear helpful but create hidden risk.

The code may compile.

The happy path may pass.

But the diff can still be unsafe.

## What Participants Practice

Participants practice reviewing a Claude-generated diff for:

```text
architecture boundaries
API compatibility
PII/logging safety
test integrity
failure-path coverage
rollback
required approvals
```

## Fast Live Use

This kata can be run in 4 minutes:

```text
30 seconds — show diff summary
90 seconds — participants check risks
60 seconds — decide approve/request/block
60 seconds — show strong rationale and safer response
```

## Strong Rule

```text
Do not approve a Claude-generated diff just because it fixes the visible bug.
```
