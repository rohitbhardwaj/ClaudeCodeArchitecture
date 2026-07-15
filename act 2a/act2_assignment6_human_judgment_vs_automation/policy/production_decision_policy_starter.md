# Production Decision Policy Starter

## Purpose

Define which production decisions must remain human-owned when using Claude Code.

## Human-Owned Decisions

```text
production release approval
rollback
public API contract change
payment behavior
pricing behavior
tax behavior
refund behavior
security control change
auth/authorization behavior
data migration approval
merge to protected branch
```

## Claude Code Role

Claude may:

```text
summarize evidence
list options
identify risks
draft plans
prepare review artifacts
```

Claude must not:

```text
approve release
decide rollback
merge PR
approve API contract changes
approve payment behavior changes
override security review
```

## Required Evidence for Human Decisions

```text
impact summary
risk summary
tests run
rollback plan
customer impact
security impact
owner approval
```
