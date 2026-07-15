# Example Completed Classification Worksheet

| Use case | Classification | Why |
|---|---|---|
| Generate a utility function | Level 1 | Local code generation with limited repo context. |
| Explain a service dependency graph | Level 2 | Requires understanding relationships across files. |
| Refactor a module across files | Level 2 or 3 | Multi-file change; becomes Level 3 if tied to tests, PR, and workflow. |
| Generate tests based on existing behavior | Level 2 | Tests must preserve existing behavior across the repo. |
| Create a PR summary | Level 3 | Participates in the review workflow. |
| Analyze architecture drift | Level 2 or 3 | Repo-aware analysis; becomes workflow-level if used as a gate. |
| Suggest migration steps for legacy code | Level 2 | Requires dependency and behavior understanding. |
| Run test commands and interpret failures | Level 3 | Participates in engineering feedback loop. |
| Update docs after code changes | Level 3 | Documentation becomes part of delivery workflow. |
| Propose quality gates for a repo | Level 3 | Affects governance and delivery system. |

## Example Reflection

```text
Our team still treats Claude like autocomplete when we ask it to “fix the bug” without giving it repository context, test expectations, API boundaries, or approval rules.
```

## Example Action

```text
For checkout bugs, we should first ask Claude to map entry points, dependencies, tests, and API contracts before modifying code.
```

## Example Control

```text
Add a CLAUDE.md rule requiring analyze-first mode for multi-file or production behavior changes.
```
