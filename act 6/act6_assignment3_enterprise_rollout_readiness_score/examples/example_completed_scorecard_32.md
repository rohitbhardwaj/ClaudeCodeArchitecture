# Example Completed Scorecard — 32/50

| Readiness area | Score | Evidence | Improvement needed |
|---|---:|---|---|
| `CLAUDE.md` exists and is current | 3 | Exists but needs update cadence | Add quarterly review owner |
| CODEOWNERS configured | 3 | Exists but incomplete owner coverage | Add API/security/platform/test owners |
| PR template includes Claude disclosure | 3 | Mentions Claude but lacks risk/rollback fields | Add prompt, risks, rollback, approvals |
| Tests required in CI | 4 | Unit tests required | Add stronger failure-path requirements |
| API contract tests exist | 2 | Placeholder exists | Add real contract tests |
| Security/PII scanning exists | 3 | Basic grep scan | Add stronger scanning |
| Dependency scanning exists | 3 | Placeholder configured | Enforce dependency scan |
| Rollback process is defined | 3 | Runbook exists | Require rollback in PR template |
| Developers trained on plan-first workflow | 4 | Training outline exists | Make training mandatory |
| Reviewers trained on AI-generated diffs | 4 | Kata exists | Add reviewer certification/checklist |

## Total

```text
32/50
```

## Recommendation

```text
Pilot with restrictions.
```
