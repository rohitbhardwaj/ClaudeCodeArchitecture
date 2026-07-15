# Human Judgment vs Automation Guide

## Why This Matters

Claude Code can accelerate engineering work by:

```text
explaining code
generating tests
suggesting refactors
drafting documentation
summarizing evidence
```

But acceleration is not the same as accountability.

Architecture requires judgment about:

```text
tradeoffs
risk
customer impact
security
cost
operability
long-term maintainability
organizational constraints
```

## Core Principle

```text
Claude can recommend.
Humans remain accountable.
```

## What Claude Is Good At

Claude can help with:

```text
pattern recognition
summarization
drafting
test generation
risk identification
code explanation
evidence organization
```

## What Humans Must Own

Humans must own:

```text
architecture decisions
production releases
rollback decisions
public API commitments
payment behavior
security approval
business tradeoffs
governance exceptions
```

## Shared Responsibilities

Some tasks are shared because Claude can assist but humans must validate.

Examples:

```text
unit tests
ADRs
security risk identification
refactor planning
incident analysis
```

## Decision Rule

Ask:

```text
Who is accountable if this decision harms customers, security, revenue, or production?
```

If the answer is a human leader, architect, product owner, or operator, then a human must decide.
