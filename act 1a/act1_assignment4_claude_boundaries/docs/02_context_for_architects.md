# Context for Architects

## Why This Assignment Matters

Claude Code is powerful because it can operate across a repository.

That power is useful for:

```text
explaining code
generating tests
suggesting refactors
drafting documentation
analyzing risks
summarizing pull requests
```

But the same power can be dangerous when it touches:

```text
security controls
payment behavior
public APIs
data migrations
dependency versions
production configuration
secrets
PII
large-scale rewrites
```

## The Governance Principle

The goal is not to block Claude Code.

The goal is to make acceleration safe.

## Boundary Model

Use three levels:

### 1. May Do

Low-risk tasks Claude can perform without special approval.

Examples:

```text
explain code
summarize files
generate draft tests
draft documentation
identify risks
suggest refactoring options
```

### 2. Must Ask First

Medium-to-high-risk tasks that may be valid but require explicit human approval.

Examples:

```text
modify auth logic
change payment behavior
change public APIs
add dependencies
modify migrations
change CI/CD
large refactors
```

### 3. Must Never Do

Tasks that should be blocked by policy, tooling, or review gates.

Examples:

```text
expose secrets
log PII
delete tests silently
bypass code review
commit directly to main
disable security scans
hide failing tests
```

## Key Architecture Lesson

An AI agent without boundaries becomes an unreviewed change engine.

A governed AI agent becomes a controlled engineering accelerator.
