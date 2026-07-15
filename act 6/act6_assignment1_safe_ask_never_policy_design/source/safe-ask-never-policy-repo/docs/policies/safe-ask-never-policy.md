# Safe / Ask / Never Claude Code Policy

## Purpose

Define explicit authority boundaries for Claude Code.

## Safe

Claude may proceed independently for:

```text
read-only analysis
explanation
dependency mapping
draft documentation
draft unit tests that do not replace existing tests
```

## Ask First

Claude must ask for approval before:

```text
structural refactor
public API change
dependency addition
payment/pricing/tax/refund change
CI/CD workflow change
test replacement or deletion
data model/migration change
```

## Never

Claude must never:

```text
log PII
remove failing tests silently
weaken assertions to make tests pass
bypass CODEOWNERS
hide AI involvement in PR
change production secrets
disable security controls
```

## Key Lesson

Claude Code needs explicit authority boundaries before it can scale.
