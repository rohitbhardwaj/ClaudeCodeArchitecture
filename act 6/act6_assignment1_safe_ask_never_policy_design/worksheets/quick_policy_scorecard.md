# Quick Policy Scorecard

Score the classification policy.

| Criterion | Points |
|---|---:|
| Safe tasks are truly low-risk/read-only | 1 |
| Ask-first tasks include structural changes | 1 |
| Ask-first tasks include API changes | 1 |
| Ask-first tasks include dependencies | 1 |
| Ask-first tasks include payment/financial changes | 1 |
| Never tasks include PII logging | 1 |
| Never tasks include silent test deletion | 1 |
| Approval owners are clear | 1 |
| Policy can be placed in repo artifacts | 1 |

## Score

```text
/9
```

## Interpretation

```text
8–9: Strong scalable authority model
6–7: Good but missing a risk class
4–5: Partial policy
0–3: Not ready for production rollout
```
