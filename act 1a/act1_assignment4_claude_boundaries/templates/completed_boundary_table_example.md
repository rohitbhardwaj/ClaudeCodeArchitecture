# Example Completed Boundary Table

| Claude may do | Claude must ask first | Claude must never do |
|---|---|---|
| Explain code | Modify auth logic | Expose secrets |
| Generate draft tests | Change payment behavior | Delete tests silently |
| Draft documentation | Change public APIs | Log PII |
| Suggest refactors | Add or upgrade dependencies | Rewrite large modules without approval |
| Analyze risks | Modify data migrations | Bypass review |
| Summarize PRs | Change tax/pricing logic | Commit directly to main |
| Identify dead code | Modify CI/CD workflows | Disable security scans |
| Draft ADRs | Change production config | Hide failing tests |
| Create test data | Modify infrastructure code | Print environment variables |
| Find coupling | Change role/permission rules | Remove audit logging |

## Strongest “Must Ask First” Rule

```text
Claude must ask first before changing authentication, authorization, payment, pricing, tax, public API, or data migration behavior.
```

## Why This Prevents Damage

These areas have the highest blast radius:

```text
security
customer trust
money movement
compliance
client compatibility
data integrity
rollback complexity
```
