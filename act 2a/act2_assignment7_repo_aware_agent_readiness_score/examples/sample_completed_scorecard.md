# Sample Completed Readiness Scorecard

## Repository

```text
checkout-service
```

## Scorecard

| Dimension | Score 1–5 | Notes |
|---|---:|---|
| Clear repository structure | 4 | Modules are clear, but some legacy folders remain. |
| Good README | 3 | Setup exists, but architecture overview is thin. |
| Strong CLAUDE.md | 2 | Basic file exists, lacks approval boundaries. |
| Existing tests | 4 | Good unit tests, limited characterization tests. |
| API contracts documented | 4 | OpenAPI exists, contract tests incomplete. |
| Architecture boundaries clear | 3 | Clear to senior engineers, not fully documented. |
| Security rules documented | 2 | Security review is tribal knowledge. |
| Logging/PII rules documented | 2 | No explicit do-not-log list. |
| CI/CD quality gates | 4 | Tests, lint, dependency scan; no API diff check. |
| CODEOWNERS/review ownership | 3 | CODEOWNERS exists but high-risk areas incomplete. |
| Rollback patterns | 2 | Feature flags inconsistent; rollback docs weak. |
| ADRs or design docs | 3 | Some ADRs, not current for checkout. |

## Total Score

```text
36
```

## Interpretation

```text
26–40: Use Claude Code only for read-only analysis and draft docs.
```

## Best Improvement

```text
Create a stronger CLAUDE.md with approval boundaries, security rules, test rules, and logging/PII rules.
```

## Why

This would immediately improve Claude's behavior across discovery, testing, review, and coding tasks.
