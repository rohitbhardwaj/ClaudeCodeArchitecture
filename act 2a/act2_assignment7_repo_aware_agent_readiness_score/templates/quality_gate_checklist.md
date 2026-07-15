# CI/CD Quality Gate Checklist

Use this to improve the CI/CD quality-gate score.

## Required Gates

```text
[ ] unit tests
[ ] integration tests
[ ] linting
[ ] formatting
[ ] coverage threshold
[ ] dependency vulnerability scan
[ ] license scan
[ ] secret scan
[ ] static analysis
```

## Recommended Advanced Gates

```text
[ ] API contract diff check
[ ] database migration safety check
[ ] PII logging scan
[ ] architecture dependency rule check
[ ] test deletion detection
[ ] CODEOWNER approval check
[ ] feature flag check for risky changes
```

## Claude-Assisted PR Gate

```text
[ ] PR identifies Claude-assisted work
[ ] prompt/task summary included
[ ] tests run listed
[ ] architecture impact listed
[ ] security impact listed
[ ] rollback plan included
```
