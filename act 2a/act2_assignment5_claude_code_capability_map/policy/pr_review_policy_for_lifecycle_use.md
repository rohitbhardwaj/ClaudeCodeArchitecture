# PR Review Policy for Claude Code Lifecycle Use

## Every Claude-Assisted PR Should Include

```text
1. Lifecycle stage involved.
2. Prompt or task summary.
3. Files changed.
4. Tests added or updated.
5. Tests run.
6. Architecture impact.
7. Security impact.
8. API impact.
9. Rollback risk.
10. Human approvals required.
```

## Stage-Specific Review

### Coding

```text
small PR
approved scope
behavior preserved
```

### Testing

```text
assertions reviewed
failure paths included
no weakened tests
```

### Documentation

```text
docs verified against code
unsupported claims removed
```

### Modernization

```text
characterization tests first
incremental migration
rollback plan
```

### Incident Response

```text
evidence attached
human incident commander identified
no unapproved hotfix
```
