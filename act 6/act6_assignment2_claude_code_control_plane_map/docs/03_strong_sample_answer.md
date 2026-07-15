# Strong Sample Answer

| Control needed | Where should it live? | Why? |
|---|---|---|
| Repo-specific Claude rules | `CLAUDE.md` | Claude can read and follow it |
| Architecture boundaries | `docs/architecture`, `CLAUDE.md` | Human and AI-readable design rules |
| Approval owners | `CODEOWNERS` | Enforce review ownership |
| PR disclosure requirements | PR template | Makes Claude usage visible |
| Test requirements | `CLAUDE.md`, PR template, CI | Guides behavior and verifies it |
| API contract rules | OpenAPI, contract tests | Protects client behavior |
| Dependency review rules | `CLAUDE.md`, dependency policy, CI scan | Controls supply-chain risk |
| Security/PII rules | Security policy, logging policy, CI scan | Prevents sensitive data leakage |
| Rollback expectations | PR template, runbook | Required before production change |
| CI enforcement | GitHub Actions / pipeline | Automates quality gates |

## Final Principle

```text
Governance must live where developers and Claude Code can actually see it.
```
