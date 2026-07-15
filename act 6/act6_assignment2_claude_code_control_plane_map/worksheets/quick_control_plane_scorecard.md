# Quick Control Plane Scorecard

Score the control plane design.

| Criterion | Points |
|---|---:|
| Puts Claude rules in `CLAUDE.md` | 1 |
| Puts architecture boundaries in docs and `CLAUDE.md` | 1 |
| Uses `CODEOWNERS` for approvals | 1 |
| Uses PR template for Claude disclosure | 1 |
| Defines test requirements in guidance and CI | 1 |
| Protects API contract with OpenAPI and tests | 1 |
| Controls dependencies with policy and scan | 1 |
| Controls PII with security policy and scan | 1 |
| Requires rollback in PR/runbook | 1 |
| Automates gates in CI | 1 |

## Score

```text
/10
```

## Interpretation

```text
9–10: Strong control plane
7–8: Good but missing one enforcement layer
5–6: Guidance-heavy but weak enforcement
0–4: Not ready for governed rollout
```
