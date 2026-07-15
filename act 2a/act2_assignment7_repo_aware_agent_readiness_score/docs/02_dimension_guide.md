# Readiness Dimension Guide

## 1. Clear Repository Structure

A repo-aware agent needs predictable structure.

Look for:

```text
clear modules
consistent naming
separation of concerns
obvious entry points
limited dead folders
```

## 2. Good README

The README should explain:

```text
purpose
setup
test commands
run commands
main workflows
ownership
known limitations
```

## 3. Strong CLAUDE.md

A strong CLAUDE.md tells Claude:

```text
architecture rules
forbidden actions
approval-required areas
test expectations
security rules
logging/PII rules
repository conventions
```

## 4. Existing Tests

Look for:

```text
unit tests
integration tests
contract tests
characterization tests
failure-path tests
```

## 5. API Contracts Documented

Look for:

```text
OpenAPI
GraphQL schema
protobuf
event contracts
consumer contract tests
```

## 6. Architecture Boundaries Clear

Look for documented or obvious boundaries:

```text
controller vs service
domain vs infrastructure
data access boundaries
integration boundaries
module ownership
```

## 7. Security Rules Documented

Look for guidance on:

```text
auth
authorization
secrets
dependencies
input validation
secure coding
security review
```

## 8. Logging/PII Rules Documented

Look for clear rules on:

```text
what not to log
PII handling
payment tokens
customer identifiers
correlation IDs
audit fields
```

## 9. CI/CD Quality Gates

Look for:

```text
tests
linting
coverage
security scan
dependency scan
secret scan
API contract check
migration check
```

## 10. CODEOWNERS/Review Ownership

Look for:

```text
protected areas
review owners
security ownership
API ownership
data ownership
platform ownership
```

## 11. Rollback Patterns

Look for:

```text
feature flags
revert strategy
migration rollback
deployment rollback
runbooks
monitoring
```

## 12. ADRs or Design Docs

Look for:

```text
architecture decisions
tradeoffs
system diagrams
design history
decision rationale
```
