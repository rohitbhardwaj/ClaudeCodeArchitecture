# CLAUDE.md

## Repo-Specific Claude Rules

Claude must:
- analyze before editing
- follow architecture boundaries
- preserve public API behavior
- avoid PII logging
- add tests for behavior changes
- identify approval owners
- include rollback expectations

Claude must ask before:
- changing API contracts
- adding dependencies
- changing payment/pricing logic
- changing CI/CD
- deleting or weakening tests
