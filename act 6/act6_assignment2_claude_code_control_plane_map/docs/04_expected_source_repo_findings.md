# Expected Findings from Source Repo

The included source repo demonstrates the control plane.

## Controls and Artifacts

| Control | Example artifact in repo |
|---|---|
| Repo-specific Claude rules | `CLAUDE.md` |
| Architecture boundaries | `docs/architecture/boundaries.md`, `CLAUDE.md` |
| Approval owners | `CODEOWNERS` |
| PR disclosure requirements | `.github/pull_request_template/pull_request_template.md` |
| Test requirements | `CLAUDE.md`, `tests/unit`, CI workflow |
| API contract rules | `api/openapi.yaml`, `tests/contract/api_contract_test.md` |
| Dependency review rules | `docs/policies/dependency-review-policy.md`, `pom.xml`, CI |
| Security/PII rules | `docs/security/pii-logging-policy.md`, CI scan |
| Rollback expectations | `docs/runbooks/rollback-runbook.md`, PR template |
| CI enforcement | `.github/workflows/ci.yml` |

## Teaching Point

The best control plane combines readable guidance with automated verification.
