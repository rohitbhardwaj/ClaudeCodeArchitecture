# CLAUDE.md

## Repository Purpose

Describe what this repository does.

## Architecture Boundaries

```text
Controller:
Service:
Domain:
Data:
External integrations:
```

## Safe / Ask / Never

### Safe

```text
explain code
draft docs
draft tests
map dependencies
```

### Ask First

```text
architecture changes
API changes
dependency changes
payment/pricing/tax/refund changes
CI/CD changes
data model changes
```

### Never

```text
PII logging
silent test deletion
weakened assertions
bypassed approvals
hidden Claude usage
```

## Plan-First Workflow

Claude must analyze before editing.

Return:

```text
problem restatement
files inspected
blast radius
implementation plan
tests needed
risks
approval owners
rollback plan
```

Wait for approval before modifying files.

## Testing Expectations

```text
happy path
failure path
edge cases
contract tests when APIs change
security tests when applicable
```

## Security Rules

```text
Do not log PII.
Do not expose secrets.
Do not weaken auth or validation.
```

## PR Expectations

```text
small focused PR
Claude disclosure
tests run
risk and rollback
approval owners
```
