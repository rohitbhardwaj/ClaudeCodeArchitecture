# Enterprise Claude Code Rollout Readiness Policy

## Purpose

Ensure Claude Code rollout on production repositories is based on readiness evidence.

## Required Readiness Areas

```text
CLAUDE.md current
CODEOWNERS configured
PR template includes Claude disclosure
tests required in CI
API contract tests
security/PII scanning
dependency scanning
rollback process
developer training
reviewer training
```

## Score Interpretation

```text
40–50: Ready for governed rollout
30–39: Pilot with restrictions
20–29: Limited use only
Below 20: Not ready for production repositories
```

## Key Rule

```text
Enterprise rollout should be based on readiness evidence, not enthusiasm.
```
