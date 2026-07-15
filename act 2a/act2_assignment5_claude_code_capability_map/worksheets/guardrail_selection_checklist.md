# Guardrail Selection Checklist

For each lifecycle stage, choose appropriate guardrails.

## Discovery

```text
[ ] verify against tests
[ ] verify with code owners
[ ] cite files
[ ] label uncertainty
```

## Design

```text
[ ] architect approval
[ ] ADR required
[ ] tradeoff review
[ ] business context review
```

## Coding

```text
[ ] small PRs
[ ] approved plan
[ ] narrow file scope
[ ] no high-risk behavior change without approval
```

## Testing

```text
[ ] human review of assertions
[ ] failure-path coverage
[ ] characterization tests
[ ] no test weakening
```

## Review

```text
[ ] PR checklist
[ ] test evidence
[ ] changed-files summary
[ ] architecture/security impact section
```

## Documentation

```text
[ ] review against code
[ ] review against tests
[ ] date/version docs
[ ] avoid unsupported claims
```

## Modernization

```text
[ ] characterization tests first
[ ] incremental migration
[ ] rollback plan
[ ] dependency map
```

## Incident Response

```text
[ ] human incident commander
[ ] evidence-based claims
[ ] no unapproved hotfix
[ ] post-incident review
```
