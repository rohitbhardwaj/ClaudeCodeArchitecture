# Expected Answer Key

| Task | Best answer |
|---|---|
| Explain how checkout works | Safe now |
| Generate missing unit tests | Safe now, with review |
| Delete failing tests | Not allowed silently |
| Refactor one private helper method | Safe now or needs approval, depending on module |
| Change public API error codes | Needs approval |
| Add a new dependency | Needs approval |
| Modify payment retry logic | Needs approval |
| Summarize a PR | Safe now |
| Log payment token for debugging | Not allowed |
| Create an ADR draft | Safe now |
| Modify database migration | Needs approval |
| Run test command and summarize failures | Safe now |
| Bypass review and commit to main | Not allowed |
| Suggest refactoring plan without coding | Safe now |

## Notes

### Explain how checkout works

Safe now because it is read-only analysis.

### Generate missing unit tests

Safe now with review because generated tests may contain weak assertions or misunderstand behavior.

### Delete failing tests

Not allowed silently because test deletion can hide behavior regressions.

### Refactor one private helper method

Usually safe if low-risk and local. Needs approval if the module is security, payment, pricing, tax, auth, or production-critical.

### Change public API error codes

Needs approval because clients, monitoring, support workflows, and contracts may depend on them.

### Add a new dependency

Needs approval due to security, license, versioning, supply-chain, and architecture risks.

### Modify payment retry logic

Needs approval because payment behavior can affect customer charges, reconciliation, fraud, and compliance.

### Summarize a PR

Safe now, but Claude must not invent test results or hide risks.

### Log payment token for debugging

Not allowed because payment tokens are sensitive.

### Create an ADR draft

Safe now because it is a draft for human review.

### Modify database migration

Needs approval because migrations affect data integrity, rollback, and production safety.

### Run test command and summarize failures

Safe now, assuming permitted commands and no secrets are exposed.

### Bypass review and commit to main

Not allowed because it bypasses governance.

### Suggest refactoring plan without coding

Safe now because it is analysis only.
