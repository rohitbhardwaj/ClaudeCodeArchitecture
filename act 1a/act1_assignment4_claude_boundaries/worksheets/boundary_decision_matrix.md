# Boundary Decision Matrix

Use this matrix to decide whether an activity belongs in **may do**, **must ask first**, or **must never do**.

| Question | If yes, likely category |
|---|---|
| Could this expose secrets or PII? | Must never do |
| Could this bypass review or approval? | Must never do |
| Could this weaken tests or hide failures? | Must never do |
| Could this change authentication or authorization? | Must ask first |
| Could this change payment, pricing, billing, or tax behavior? | Must ask first |
| Could this change a public API contract? | Must ask first |
| Could this modify database migrations or schemas? | Must ask first |
| Could this add or upgrade dependencies? | Must ask first |
| Could this rewrite a large module? | Must ask first |
| Is this read-only analysis? | May do |
| Is this draft documentation? | May do |
| Is this generating tests for human review? | May do |
| Is this summarizing code or risks? | May do |

## Decision Rule

When in doubt, move the action one level stricter.

```text
May do → Must ask first → Must never do
```
