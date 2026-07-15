# Task Boundary Decision Matrix

Use this matrix to classify tasks.

| Question | Classification |
|---|---|
| Is the task read-only analysis? | Safe now |
| Is the task drafting documentation or ADRs? | Safe now |
| Is the task generating tests without changing production code? | Safe now, with review |
| Is the task running approved test commands? | Safe now |
| Could it change public behavior? | Needs approval |
| Could it change public API contracts? | Needs approval |
| Could it change payment, pricing, tax, or refund behavior? | Needs approval |
| Could it modify authentication or authorization? | Needs approval |
| Could it modify database schema or migrations? | Needs approval |
| Could it add or upgrade dependencies? | Needs approval |
| Could it expose secrets or PII? | Not allowed |
| Could it bypass review or protected branches? | Not allowed |
| Could it remove or weaken tests silently? | Not allowed |
| Could it disable quality gates or security scans? | Not allowed |

## Simple Rule

```text
Read-only = usually safe.
Behavior-changing = approval.
Sensitive data or bypassing controls = not allowed.
```
