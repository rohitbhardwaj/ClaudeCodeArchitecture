# Expected Classification Answer Key

| Use case | Best classification |
|---|---|
| Generate a utility function | Level 1 |
| Explain a service dependency graph | Level 2 |
| Refactor a module across files | Level 2 or 3 |
| Generate tests based on existing behavior | Level 2 |
| Create a PR summary | Level 3 |
| Analyze architecture drift | Level 2 or 3 |
| Suggest migration steps for legacy code | Level 2 |
| Run test commands and interpret failures | Level 3 |
| Update docs after code changes | Level 3 |
| Propose quality gates for a repo | Level 3 |

## Notes for Discussion

### Generate a utility function

Usually Level 1 because the scope is local and easy to review.

### Explain a service dependency graph

Level 2 because Claude needs to inspect multiple files and relationships.

### Refactor a module across files

Level 2 if Claude proposes or performs a bounded refactor.

Level 3 if the refactor includes tests, docs, PR summary, commands, and workflow steps.

### Generate tests based on existing behavior

Level 2 because tests must reflect repo behavior, not generic assumptions.

### Create a PR summary

Level 3 because it participates in the review workflow.

### Analyze architecture drift

Level 2 or 3 depending on whether it is only analysis or becomes a review gate.

### Suggest migration steps for legacy code

Level 2 because it requires repository understanding, dependency mapping, and behavior preservation.

### Run test commands and interpret failures

Level 3 because Claude is participating in the engineering feedback loop.

### Update docs after code changes

Level 3 because documentation is part of delivery and can become trusted system knowledge.

### Propose quality gates for a repo

Level 3 because it affects governance and workflow design.
