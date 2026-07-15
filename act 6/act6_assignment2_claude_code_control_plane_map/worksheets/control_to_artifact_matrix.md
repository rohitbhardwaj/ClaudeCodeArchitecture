# Control-to-Artifact Matrix

| Artifact | Control type | Example |
|---|---|---|
| `CLAUDE.md` | AI-readable rules | Safe / Ask / Never, plan-first prompts |
| `docs/architecture` | Architecture guidance | Layer boundaries, service ownership |
| `CODEOWNERS` | Approval ownership | API owner, security owner, platform owner |
| PR template | Evidence and disclosure | Claude prompt, tests, risks, rollback |
| OpenAPI | API contract | Response fields, error codes |
| Contract tests | Verification | API behavior preservation |
| Dependency policy | Supply-chain governance | Add dependency only with approval |
| Security/logging policy | Privacy control | No PII logging |
| Runbook | Operating model | Rollback, incident response |
| CI workflow | Automated enforcement | tests, scans, gates |
