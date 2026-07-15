# Assignment Instructions

## Setup

Split participants into four roles:

```text
Developer
Architect
Security reviewer
Product owner
```

## Incident

A Claude-generated PR was merged.

Two days later:

```text
Checkout error rate increased.
Some valid coupons are rejected.
Customer support tickets increased.
Logs contain partial customer email addresses.
Tests are still passing.
```

## Role Tasks

### Developer

Explain:

```text
what prompt was used
what files changed
what Claude said it changed
what tests were run
```

### Architect

Identify:

```text
architecture drift
missing quality gates
API behavior changes
test gaps
rollback gaps
```

### Security Reviewer

Identify:

```text
logging issues
validation issues
data exposure
PII risk
missing security review gates
```

### Product Owner

Explain:

```text
customer impact
business impact
support impact
revenue impact
trust impact
```

## Group Output

Create a 5-part incident review:

```text
1. What changed?
2. What should have been caught before merge?
3. Which prompt constraint was missing?
4. Which quality gate was missing?
5. What rule should be added to CLAUDE.md?
```

## Final Question

```text
Was this an AI failure, a human review failure, or a governance failure?
```
