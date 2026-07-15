# Lifecycle Stage Guide

## Discovery

Claude Code can help understand existing code, map dependencies, and identify ownership or risk hotspots.

Risks:

```text
misreading outdated code
missing runtime behavior
inferring intent from messy implementation
```

Guardrails:

```text
verify against tests, logs, docs, and code owners
```

## Design

Claude Code can draft options, tradeoffs, ADRs, and architecture alternatives.

Risks:

```text
premature abstraction
over-engineering
missing business context
```

Guardrails:

```text
architect approval and decision records
```

## Coding

Claude Code can generate focused changes and implement approved plans.

Risks:

```text
over-generation
hidden behavior changes
inconsistent patterns
```

Guardrails:

```text
small PRs, narrow scope, explicit constraints
```

## Testing

Claude Code can generate unit, edge, integration, and characterization tests.

Risks:

```text
weak assertions
tests matching changed behavior
missing negative paths
```

Guardrails:

```text
human review and behavior-preservation checks
```

## Review

Claude Code can summarize PRs, identify risks, and check against quality gates.

Risks:

```text
missing hidden behavior
over-trusting summaries
inventing test results
```

Guardrails:

```text
review checklist and evidence-based summaries
```

## Documentation

Claude Code can update README, ADRs, onboarding docs, and diagrams.

Risks:

```text
docs may become false
docs may overstate guarantees
```

Guardrails:

```text
review against code and tests
```

## Modernization

Claude Code can analyze legacy modules, map dependencies, and propose migration steps.

Risks:

```text
unsafe rewrite
loss of behavior
large unreviewable changes
```

Guardrails:

```text
characterization tests and incremental migration
```

## Incident Response

Claude Code can analyze diffs, logs, tests, and possible root causes.

Risks:

```text
wrong root cause
confirmation bias
unsafe quick fixes
```

Guardrails:

```text
human incident commander and evidence-based analysis
```
