# Assignment Instructions

## Scenario

A development team wants to use Claude Code for several engineering tasks.

Your job as an architect is to classify each task into one of three categories:

```text
Safe now
Needs approval
Not allowed
```

## Categories

### Safe now

Claude may do this with normal human review.

Examples:

```text
explain code
summarize a PR
draft documentation
suggest a refactoring plan without coding
run tests and summarize failures
```

### Needs approval

Claude may do this only after explicit approval because the task can affect architecture, security, data, customers, or production behavior.

Examples:

```text
change public API error codes
add a dependency
modify payment behavior
modify database migrations
```

### Not allowed

Claude should not do this because it bypasses engineering controls, exposes sensitive data, or hides quality problems.

Examples:

```text
log payment tokens
bypass review
delete failing tests silently
commit directly to main
```

## Reflection Question

```text
Which task would your team most likely misclassify today?
```

## Output

Complete the worksheet in:

```text
worksheets/participant_task_boundary_worksheet.md
```
