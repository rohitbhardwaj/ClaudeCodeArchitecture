# Expected Findings from Source Repo

The source repo shows where adoption metrics can be captured.

## Evidence Sources

| Metric area | Evidence source |
|---|---|
| Delivery speed | `data/sample_adoption_metrics.csv`, PR timestamps |
| PR quality | Review comment categories in report |
| Review effort | Review rounds and reviewer minutes |
| Test coverage | CI report and PR template |
| Defect rate | Post-merge defects in sample data |
| Security findings | CI security scan and sample metrics |
| Rollback rate | Rollback count in sample metrics |
| Developer experience | survey template and sample survey results |

## Correct Framing

Do not report only:

```text
Claude-assisted PR count
prompt count
generated lines
```

Report outcomes and guardrails together.
