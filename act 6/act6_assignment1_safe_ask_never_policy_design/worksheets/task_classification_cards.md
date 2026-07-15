# Task Classification Cards

## Explain Unfamiliar Code

Classification:

```text
Safe
```

Reason:

```text
Read-only analysis.
```

Owner:

```text
None
```

## Generate Draft Unit Tests

Classification:

```text
Safe/Ask
```

Reason:

```text
Safe if drafting; ask if replacing existing tests or locking production behavior.
```

Owner:

```text
QA/architecture if production behavior.
```

## Refactor Controller Structure

Classification:

```text
Ask first
```

Reason:

```text
Structural change.
```

Owner:

```text
Architecture
```

## Change Public API Error Code

Classification:

```text
Ask first / Never without approval
```

Reason:

```text
Contract risk.
```

Owner:

```text
API owner
```

## Add Dependency

Classification:

```text
Ask first
```

Reason:

```text
Supply-chain/license risk.
```

Owner:

```text
Platform/security
```

## Modify Payment Logic

Classification:

```text
Ask first
```

Reason:

```text
Financial behavior risk.
```

Owner:

```text
Payments/finance
```

## Remove Failing Test

Classification:

```text
Never silently
```

Reason:

```text
Weakens safety net.
```

Owner:

```text
QA/architecture
```

## Update Docs

Classification:

```text
Safe
```

Reason:

```text
Low-risk if factual.
```

Owner:

```text
Reviewer
```

## Change CI/CD Workflow

Classification:

```text
Ask first
```

Reason:

```text
Delivery/security risk.
```

Owner:

```text
Platform
```

## Add PII Logging

Classification:

```text
Never
```

Reason:

```text
Privacy/security risk.
```

Owner:

```text
Security
```
