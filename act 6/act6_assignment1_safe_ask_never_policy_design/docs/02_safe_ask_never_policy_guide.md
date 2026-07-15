# Safe / Ask / Never Policy Guide

## Why Authority Boundaries Matter

Claude Code can reason, edit, test, and propose changes across a repository.

That power needs explicit authority boundaries.

A team should not rely on each developer’s judgment alone. The repository should define:

```text
what Claude can do safely
what Claude must ask before doing
what Claude must never do
```

## Definitions

### Safe

Low-risk work Claude may do without special approval.

Examples:

```text
explain unfamiliar code
summarize dependencies
draft documentation
draft tests without replacing existing tests
```

### Ask First

Work that may be appropriate, but requires human approval before proceeding.

Examples:

```text
refactor structure
change API behavior
add dependencies
change CI/CD
modify payment behavior
```

### Never

Work Claude should not do silently or should not do at all.

Examples:

```text
remove failing tests silently
log PII
weaken security controls
bypass approval gates
hide AI involvement
```

## Strong Rule

```text
If the task can affect money, security, public contracts, delivery pipelines, or test safety, Claude must ask first.
```
