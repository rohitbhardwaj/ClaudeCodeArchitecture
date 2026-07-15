# Repo Context Review Checklist

Before Claude modifies code, answer these questions.

## Scope

```text
[ ] Do we know the entry point?
[ ] Do we know the core business logic?
[ ] Do we know related files?
[ ] Do we know external dependencies?
```

## Behavior

```text
[ ] Do we know current behavior?
[ ] Do we know behavior that must remain unchanged?
[ ] Do we know edge cases?
```

## Tests

```text
[ ] Do we know existing tests?
[ ] Do we know missing tests?
[ ] Do we need characterization tests before refactoring?
```

## API

```text
[ ] Could response fields change?
[ ] Could error codes change?
[ ] Could status codes change?
[ ] Is openapi.yaml impacted?
```

## Security

```text
[ ] Are payment tokens involved?
[ ] Is PII involved?
[ ] Are logs involved?
[ ] Are auth or authorization checks involved?
```

## Data

```text
[ ] Could persistence behavior change?
[ ] Could schema or migrations be affected?
[ ] Could order data be changed?
```

## Approval

```text
[ ] Which files may Claude inspect?
[ ] Which files require approval before modification?
[ ] Which files must not be modified?
```
