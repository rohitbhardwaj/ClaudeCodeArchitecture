# Safe / Ask / Never Policy

## Safe

Claude may proceed with low-risk work such as:

```text
explain unfamiliar code
summarize dependencies
draft documentation
draft unit tests without replacing existing tests
map repo context
identify impacted files
```

## Ask First

Claude must ask before:

```text
refactoring structure
changing public API behavior
adding dependencies
modifying payment, pricing, tax, or refund logic
changing CI/CD
changing tests that protect production behavior
modifying data models or migrations
changing security-sensitive code
```

## Never

Claude must never:

```text
log PII
remove failing tests silently
weaken assertions to make tests pass
bypass CODEOWNERS
hide Claude involvement in PRs
change secrets
disable security controls
ship production-impacting changes without rollback
```

## Strong Rule

```text
If it affects money, security, public contracts, delivery pipelines, or test safety, Claude must ask first.
```
