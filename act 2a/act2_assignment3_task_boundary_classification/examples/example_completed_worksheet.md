# Example Completed Worksheet

| Task | Classification | Why |
|---|---|---|
| Explain how checkout works | Safe now | Read-only analysis. |
| Generate missing unit tests | Safe now, with review | Tests are useful but assertions must be reviewed. |
| Delete failing tests | Not allowed silently | Hides regressions and weakens safety net. |
| Refactor one private helper method | Safe now or needs approval | Depends on module risk and blast radius. |
| Change public API error codes | Needs approval | Breaks clients, support, and monitoring. |
| Add a new dependency | Needs approval | Security, license, version, and supply-chain risk. |
| Modify payment retry logic | Needs approval | Can affect customer charges and reconciliation. |
| Summarize a PR | Safe now | Workflow support, but must not invent facts. |
| Log payment token for debugging | Not allowed | Sensitive data exposure. |
| Create an ADR draft | Safe now | Draft for human review. |
| Modify database migration | Needs approval | Data loss and rollback risk. |
| Run test command and summarize failures | Safe now | Useful feedback loop if command is approved. |
| Bypass review and commit to main | Not allowed | Violates governance. |
| Suggest refactoring plan without coding | Safe now | Analysis only. |

## Example Reflection

```text
Our team would most likely misclassify “refactor one private helper method” as always safe. In payment, auth, pricing, or tax code, even private helpers can change production behavior.
```

## Example CLAUDE.md Rule

```markdown
Claude may suggest refactoring plans without approval, but must ask before modifying code in payment, pricing, tax, refund, authentication, authorization, public API, database migration, or production configuration areas.
```
