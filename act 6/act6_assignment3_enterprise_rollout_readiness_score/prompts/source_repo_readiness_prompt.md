# Source Repo Readiness Prompt

```text
Assess this repository for Claude Code production rollout readiness.

Inspect:
- CLAUDE.md
- CODEOWNERS
- PR template
- CI workflow
- API contract tests
- security/PII scanning
- dependency scanning
- rollback runbook
- developer training docs
- reviewer training docs
- evidence/current-state
- evidence/gaps

Score each area from 1 to 5.

Return:
1. readiness scorecard
2. total score
3. readiness category
4. what Claude Code use should be allowed now
5. what should remain restricted
6. top 5 improvements
```
