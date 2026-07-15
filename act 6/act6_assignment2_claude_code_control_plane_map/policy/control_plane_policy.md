# Claude Code Control Plane Policy

## Purpose

Define where Claude Code governance controls must live.

## Required Control Locations

```text
Repo-specific rules: CLAUDE.md
Architecture boundaries: docs/architecture and CLAUDE.md
Approval owners: CODEOWNERS
PR disclosure: PR template
Test requirements: CLAUDE.md, PR template, CI
API contract: OpenAPI and contract tests
Dependency review: dependency policy and CI scan
Security/PII: security policy, logging policy, CI scan
Rollback: PR template and runbook
CI enforcement: GitHub Actions or pipeline
```

## Key Rule

```text
Governance must live where developers and Claude Code can actually see it.
```
