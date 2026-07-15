# Scoring Rubric — Claude Code Boundary Table

## 5 — Excellent

Participant clearly separates low-risk read-only tasks, approval-required tasks, and forbidden tasks.

Includes:

```text
auth
payments
public APIs
migrations
dependencies
secrets
PII
test deletion
review bypass
large rewrites
CI/CD
```

## 4 — Strong

Participant captures most major production risks and defines practical boundaries.

May miss one or two categories such as CI/CD or dependency upgrades.

## 3 — Acceptable

Participant identifies obvious risks such as secrets and auth but misses broader architecture risks.

## 2 — Weak

Participant mostly focuses on code generation and does not define strong approval boundaries.

## 1 — Poor

Participant allows Claude to modify most production areas without approval.
