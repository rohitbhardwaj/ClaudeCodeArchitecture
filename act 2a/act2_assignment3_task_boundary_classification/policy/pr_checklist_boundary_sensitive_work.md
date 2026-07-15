# PR Checklist for Boundary-Sensitive Work

Use this for Claude-generated or Claude-assisted PRs.

## Task Classification

```text
[ ] Safe now
[ ] Needs approval
[ ] Not allowed request redirected
```

## If Needs Approval

```text
[ ] Approval obtained from required owner
[ ] Current behavior documented
[ ] Impacted files listed
[ ] Tests listed
[ ] Risks documented
[ ] Rollback plan included
```

## Tests

```text
[ ] Existing tests preserved
[ ] No tests deleted silently
[ ] No assertions weakened
[ ] Failure paths covered
```

## Security

```text
[ ] No secrets exposed
[ ] No PII logged
[ ] No payment tokens logged
[ ] Security-sensitive behavior reviewed
```

## API / Data

```text
[ ] Public API compatibility checked
[ ] Database migration reviewed
[ ] Data rollback considered
```

## Review

```text
[ ] Required CODEOWNERS reviewed
[ ] Architecture review completed if needed
[ ] Product/security/finance review completed if needed
```
