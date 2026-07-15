# Strong Sample Answer

| Claude Code task | Safe / Ask / Never | Why? | Approval owner |
|---|---|---|---|
| Explain unfamiliar code | Safe | Read-only analysis | None |
| Generate draft unit tests | Safe/Ask | Safe if not replacing existing tests | QA/architecture if production behavior |
| Refactor controller structure | Ask first | Structural change | Architecture |
| Change public API error code | Ask first / Never without approval | Contract risk | API owner |
| Add dependency | Ask first | Supply-chain/license risk | Platform/security |
| Modify payment logic | Ask first | Financial behavior risk | Payments/finance |
| Remove failing test | Never silently | Weakens safety net | QA/architecture |
| Update docs | Safe | Low-risk if factual | Reviewer |
| Change CI/CD workflow | Ask first | Delivery/security risk | Platform |
| Add PII logging | Never | Privacy/security risk | Security |

## Final Principle

```text
Claude Code needs explicit authority boundaries before it can scale.
```
