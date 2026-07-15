# Participant Guide

## Welcome

This workshop is designed to help you use Claude Code as part of a governed engineering system.

You will practice how to:

```text
analyze before editing
map repository context
define authority boundaries
review AI-generated diffs
score rollout readiness
measure adoption
apply production governance
```

## How to Use the Materials

Recommended order:

```text
1. Review the slides for each act.
2. Read the assignment instructions.
3. Complete the worksheet.
4. Inspect the included source simulation.
5. Compare your answer with the strong sample answer.
6. Discuss what would change in your own repository.
```

## What to Bring

```text
a production engineering mindset
a willingness to challenge AI-generated output
knowledge of your team’s review and release process
examples of current PR templates or repo rules, if available
```

## Core Frameworks

### VIBE to GEAR

```text
VIBE = Vague intent, Instant generation, Blind trust, Entropy at scale
GEAR = Guardrails, Evaluation, Architecture judgment, Review discipline
```

### Safe / Ask / Never

```text
Safe: read-only analysis, docs drafts, draft tests
Ask: architecture, API, dependency, payment, CI/CD changes
Never: PII logging, silent test deletion, bypassed approval, hidden AI use
```

### ARCH-GATE

```text
Architecture fit
Risk and rollback
Correctness
Hidden coupling
Guardrails/security
Automated tests
Traceability/observability
Evolution/maintainability
```

## Best Mindset

Do not ask only:

```text
Can Claude Code do this?
```

Ask:

```text
Should Claude Code do this now?
What context does it need?
What approvals are required?
What tests must protect behavior?
How do we rollback?
How will reviewers know what changed?
```
