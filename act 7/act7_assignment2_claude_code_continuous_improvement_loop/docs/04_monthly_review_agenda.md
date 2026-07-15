# Monthly Claude Code Review Agenda

## 1. Review Claude-Assisted PRs

Inspect:

```text
PR size
scope
disclosure quality
tests
review comments
rollback notes
approval evidence
```

## 2. Identify Repeated Failure Patterns

Look for:

```text
large PRs
missing failure-path tests
PII logging
missing rollback
weak prompt context
architecture boundary issues
API contract risks
```

## 3. Update CLAUDE.md

Add or revise rules based on recurring failures.

## 4. Update Prompt Templates

Create reusable prompts for repeated tasks.

## 5. Update PR Checklist

Add missing evidence fields or review prompts.

## 6. Add or Strengthen CI Gates

Automate checks where repeated failures are detectable.

## 7. Add One New Kata

Turn the most common failure into a short team practice.

## 8. Publish Monthly Learning Summary

Share:

```text
what improved
what failed
what changed
what to practice next
```
