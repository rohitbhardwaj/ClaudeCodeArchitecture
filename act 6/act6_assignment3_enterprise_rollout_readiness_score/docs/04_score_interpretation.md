# Score Interpretation

| Total score | Readiness | Recommended action |
|---:|---|---|
| 40–50 | Ready for governed rollout | Roll out with guardrails and monitoring |
| 30–39 | Pilot with restrictions | Allow restricted usage in selected repos |
| 20–29 | Limited use only | Allow read-only analysis and docs/test drafting only |
| Below 20 | Not ready for production repositories | Build controls before production use |

## Restriction Examples

### Ready for Governed Rollout

```text
Plan-first workflow required.
PR disclosure required.
CODEOWNERS enforced.
CI gates active.
Rollback required.
```

### Pilot with Restrictions

```text
Selected repos only.
No autonomous production-impacting changes.
Approval required for all code edits.
Weekly review of incidents and PR quality.
```

### Limited Use Only

```text
Read-only code explanation.
Dependency mapping.
Documentation drafts.
Test drafts only.
No mergeable code changes.
```

### Not Ready

```text
No production repository use.
Start with training and control-plane setup.
```
