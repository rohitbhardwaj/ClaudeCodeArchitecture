# AI-Generated Diff Review Policy

## Purpose

Prevent unsafe AI-generated diffs from being merged.

## Policy

Every Claude-generated diff must be reviewed for:

```text
architecture boundaries
public API behavior
PII logging
test preservation
failure-path coverage
rollback
approvals
```

## Block Conditions

Block the diff when it:

```text
moves business logic into controller
changes public error codes without approval
logs PII
removes failing tests
only adds happy-path tests
omits rollback
omits required approvals
```
