# Capability Cards

Use these as discussion cards.

## Discovery

Claude can help:

```text
explain code
map dependencies
identify owners
summarize modules
```

Risk:

```text
misread outdated code
```

Guardrail:

```text
verify against tests and owners
```

## Design

Claude can help:

```text
draft ADRs
compare options
list tradeoffs
```

Risk:

```text
premature abstraction
```

Guardrail:

```text
architect approval
```

## Coding

Claude can help:

```text
generate focused changes
implement approved plan
```

Risk:

```text
over-generation
```

Guardrail:

```text
small PRs and narrow scope
```

## Testing

Claude can help:

```text
generate unit tests
edge tests
characterization tests
```

Risk:

```text
weak assertions
```

Guardrail:

```text
human review
```

## Review

Claude can help:

```text
summarize PR risks
map changed files
identify missing tests
```

Risk:

```text
miss hidden behavior
```

Guardrail:

```text
quality checklist
```

## Documentation

Claude can help:

```text
update README
draft ADR
update onboarding docs
```

Risk:

```text
docs may become false
```

Guardrail:

```text
review against code
```

## Modernization

Claude can help:

```text
analyze legacy modules
suggest migration steps
map dependencies
```

Risk:

```text
unsafe rewrite
```

Guardrail:

```text
characterization tests
```

## Incident Response

Claude can help:

```text
analyze diffs
summarize logs
compare tests
```

Risk:

```text
wrong root cause
```

Guardrail:

```text
human incident commander
```
