# One-Page Handout — Task Boundary Classification

## Three Categories

```text
Safe now
Needs approval
Not allowed
```

## Safe Now

```text
explain code
generate draft tests
summarize PR
create ADR draft
run approved tests and summarize failures
suggest refactoring plan without coding
```

## Needs Approval

```text
change public API error codes
add dependencies
modify payment retry logic
modify database migrations
change auth or authorization
change pricing, tax, refunds, or discount behavior
```

## Not Allowed

```text
log payment tokens
expose secrets
delete failing tests silently
bypass review
commit directly to main
disable quality gates
```

## Key Lesson

```text
Claude Code should not have one permission level.
Different engineering actions require different authority.
```

## Reflection

```text
Which task would your team most likely misclassify today?
```
