# Expected Findings from Source Repo

The source repo includes current-state evidence and gaps.

## Likely Score

A reasonable participant score should be around:

```text
32/50
```

## Evidence

| Readiness area | Evidence |
|---|---|
| `CLAUDE.md` exists | Present but marked as needing quarterly review |
| CODEOWNERS configured | Present but missing some owners |
| PR template includes Claude disclosure | Present but incomplete |
| Tests required in CI | Unit tests exist |
| API contract tests exist | Placeholder exists, not fully enforced |
| Security/PII scanning exists | Basic grep scan only |
| Dependency scanning exists | Placeholder only |
| Rollback process is defined | Runbook exists but not required in PR |
| Developers trained | Training outline exists |
| Reviewers trained | Diff-review training gap noted |

## Recommended Decision

```text
Pilot with restrictions.
```
