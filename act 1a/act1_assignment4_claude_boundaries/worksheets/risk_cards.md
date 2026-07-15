# Risk Cards for Group Discussion

Cut or copy these into discussion prompts.

## Risk Card 1 — Authentication

Claude proposes to simplify role checks in an authorization filter.

Question:

```text
May do, must ask first, or must never do?
```

Recommended answer:

```text
Must ask first
```

Why:

```text
Auth changes can create privilege escalation.
```

## Risk Card 2 — Tests

Claude deletes two failing tests and says they were obsolete.

Recommended answer:

```text
Must never do silently
```

Why:

```text
Deleting tests can hide behavior changes. It may be allowed only with explicit human approval and explanation.
```

## Risk Card 3 — Documentation

Claude drafts an architecture summary from existing code.

Recommended answer:

```text
May do
```

Why:

```text
Read-only documentation drafting is low risk if reviewed.
```

## Risk Card 4 — Dependency Upgrade

Claude upgrades a cryptography library to fix a warning.

Recommended answer:

```text
Must ask first
```

Why:

```text
Dependency upgrades can introduce breaking changes, licensing concerns, or security risk.
```

## Risk Card 5 — Secrets

Claude prints environment variables to debug a failing test.

Recommended answer:

```text
Must never do
```

Why:

```text
Secrets may leak into logs, terminal history, prompts, or PR comments.
```

## Risk Card 6 — Data Migration

Claude modifies a production migration to rename a column.

Recommended answer:

```text
Must ask first
```

Why:

```text
Schema changes can cause data loss, downtime, and rollback complexity.
```

## Risk Card 7 — Payment Behavior

Claude changes payment retry logic.

Recommended answer:

```text
Must ask first
```

Why:

```text
Payment changes affect customer charges, fraud, reconciliation, and compliance.
```

## Risk Card 8 — Review Workflow

Claude commits directly to main after tests pass.

Recommended answer:

```text
Must never do
```

Why:

```text
Bypassing review breaks governance.
```

## Risk Card 9 — Risk Analysis

Claude lists risks in a proposed refactor without changing code.

Recommended answer:

```text
May do
```

Why:

```text
Read-only analysis is a safe and high-value use case.
```

## Risk Card 10 — Public API

Claude changes error response fields to make code cleaner.

Recommended answer:

```text
Must ask first
```

Why:

```text
Public API changes affect clients, contracts, monitoring, and support.
```
