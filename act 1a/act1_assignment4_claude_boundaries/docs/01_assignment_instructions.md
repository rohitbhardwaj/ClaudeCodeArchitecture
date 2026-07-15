# Assignment Instructions

## Scenario

Your organization wants to let developers use Claude Code in production repositories.

The leadership team is excited because developers can move faster.

The architecture team is concerned because production repositories contain sensitive logic:

```text
authentication
authorization
payments
PII
customer data
pricing
data migrations
infrastructure configuration
secrets
public APIs
```

## Your Role

You are the architect defining initial Claude Code boundaries.

Your job is to decide what Claude may do, what Claude must ask before doing, and what Claude must never do.

## Required Output

Complete the table:

| Claude may do | Claude must ask first | Claude must never do |
|---|---|---|
|  |  |  |

## Decision Categories

You should consider:

```text
source code
tests
documentation
authentication
authorization
payments
data migrations
dependencies
public APIs
secrets
PII
logging
CI/CD
infrastructure
production configuration
large-scale refactors
```

## Final Reflection

Answer:

```text
Which “must ask first” rule would prevent the most damage in your organization?
```
