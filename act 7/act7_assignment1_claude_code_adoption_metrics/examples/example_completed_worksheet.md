# Strong Sample Answer

| Metric area | Metric | Why it matters | Good signal | Bad signal |
|---|---|---|---|---|
| Delivery speed | Cycle time from task to PR | Shows acceleration | Faster with same quality | Faster but more defects |
| PR quality | Review comments per PR category | Shows whether AI improves or creates noise | Fewer repeat issues | More architecture/security comments |
| Review effort | Reviewer time per PR | Shows review burden | Smaller, clearer PRs | Large AI-generated diffs |
| Test coverage | Happy/failure-path tests added | Protects behavior | More meaningful tests | Superficial happy-path tests |
| Defect rate | Bugs after merge | Measures real quality | Stable or lower defects | More regressions |
| Security findings | PII/secrets/dependency issues | Protects safety | Fewer findings | More risky patterns |
| Rollback rate | Rollbacks after Claude-assisted PRs | Measures production safety | Low/stable rollback rate | Rising rollback rate |
| Developer experience | Developer survey / adoption feedback | Measures usefulness | Less toil, more clarity | More confusion/rework |

## Key Lesson

```text
Measure Claude Code by outcomes, not usage volume.
```
