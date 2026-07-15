# Claude Code Governance Policy Template

## Purpose

This policy defines how Claude Code may be used in production repositories.

## Scope

Applies to:

```text
production application repositories
shared libraries
infrastructure repositories
CI/CD configuration
database migration repositories
security-sensitive services
```

## Policy Levels

### Level 1 — Low Risk

Claude may perform these activities without special approval:

```text
read-only code explanation
documentation drafts
risk analysis
test suggestions
small non-functional edits
```

### Level 2 — Approval Required

Claude must ask first and receive human approval before:

```text
changing auth logic
changing payment/pricing/tax/refund behavior
changing public APIs
adding dependencies
changing migrations
modifying CI/CD
large refactors
production config changes
```

### Level 3 — Forbidden

Claude must not:

```text
expose secrets
log PII
delete or weaken tests silently
bypass review
commit to protected branches
disable security controls
hide failing tests
```

## Required Review Gates

Every Claude-generated PR must include:

```text
summary of changes
files changed
tests added or changed
architecture impact
security impact
rollback plan
known risks
```

## Human Approval Required From

Depending on change type:

```text
architect
security reviewer
product owner
QA lead
data owner
finance/revenue owner
platform owner
```

## Enforcement

Policy should be enforced through:

```text
CLAUDE.md
branch protection
CODEOWNERS
CI/CD checks
secret scanning
test coverage gates
security scans
manual approval for high-risk areas
```
