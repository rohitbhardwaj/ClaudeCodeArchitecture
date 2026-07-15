# Repository Readiness Policy Starter

## Purpose

Define minimum repository readiness before scaling Claude Code usage.

## Minimum for Read-Only Usage

Required:

```text
README
clear repo structure
basic tests
no secrets in repo
```

Allowed:

```text
code explanation
dependency mapping
draft docs
risk summaries
```

## Minimum for Small Code Changes

Required:

```text
CLAUDE.md
tests
CI/CD test gate
CODEOWNERS for high-risk areas
security/logging rules
approval boundaries
```

Allowed:

```text
small approved changes
test generation
docs updates
focused refactors
```

## Minimum for Controlled Team Adoption

Required:

```text
strong CLAUDE.md
API contracts
quality gates
CODEOWNERS
rollback patterns
ADRs/design docs
security rules
logging/PII rules
```

Allowed:

```text
controlled lifecycle adoption across discovery, coding, testing, review, documentation, modernization, and incident analysis
```
