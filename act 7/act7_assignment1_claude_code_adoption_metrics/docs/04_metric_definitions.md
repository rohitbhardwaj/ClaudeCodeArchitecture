# Metric Definitions

## Delivery Speed

Metric:

```text
Cycle time from task start to PR opened or merged.
```

Use with caution:

```text
Faster is good only if defects, rollbacks, and review issues do not increase.
```

## PR Quality

Metric:

```text
Review comments categorized by architecture, security, API, tests, style, and clarity.
```

Good signal:

```text
Fewer repeated architecture/security/API issues.
```

## Review Effort

Metric:

```text
Reviewer time per PR or number of review rounds.
```

Good signal:

```text
Smaller, clearer PRs.
```

## Test Coverage

Metric:

```text
Happy-path and failure-path tests added per change.
```

Good signal:

```text
Meaningful tests that protect behavior.
```

## Defect Rate

Metric:

```text
Bugs after merge, escaped defects, regressions.
```

Good signal:

```text
Stable or lower defect rate.
```

## Security Findings

Metric:

```text
PII, secrets, dependency, auth, logging, or policy findings.
```

Good signal:

```text
Fewer risky patterns.
```

## Rollback Rate

Metric:

```text
Rollbacks after Claude-assisted PRs.
```

Good signal:

```text
Low or stable rollback rate.
```

## Developer Experience

Metric:

```text
Developer survey and qualitative feedback.
```

Good signal:

```text
Less toil and more clarity.
```
