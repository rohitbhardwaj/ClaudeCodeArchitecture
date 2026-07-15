# Guardrail Metric Checklist

Use these to prevent “more AI usage” from being mistaken for success.

```text
[ ] Defect rate is stable or lower.
[ ] Rollback rate is stable or lower.
[ ] Security findings are stable or lower.
[ ] API contract violations are not increasing.
[ ] Architecture review comments are not increasing.
[ ] PR size is not increasing.
[ ] Review time is not increasing.
[ ] Tests include failure paths, not just happy paths.
[ ] Developers report less toil, not more confusion.
[ ] Reviewers can understand Claude-assisted PRs.
```

## Red Flags

```text
More code generated but more regressions.
Faster PRs but more rollback.
More tests but superficial assertions.
Higher usage but lower trust.
```
