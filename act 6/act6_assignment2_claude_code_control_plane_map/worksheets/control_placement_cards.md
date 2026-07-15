# Control Placement Cards

## Repo-Specific Claude Rules

Where:

```text
CLAUDE.md
```

Why:

```text
Claude can read and follow it.
```

## Architecture Boundaries

Where:

```text
docs/architecture, CLAUDE.md
```

Why:

```text
Human and AI-readable design rules.
```

## Approval Owners

Where:

```text
CODEOWNERS
```

Why:

```text
Enforce review ownership.
```

## PR Disclosure Requirements

Where:

```text
PR template
```

Why:

```text
Makes Claude usage visible.
```

## Test Requirements

Where:

```text
CLAUDE.md, PR template, CI
```

Why:

```text
Guides behavior and verifies it.
```

## API Contract Rules

Where:

```text
OpenAPI, contract tests
```

Why:

```text
Protects client behavior.
```

## Dependency Review Rules

Where:

```text
CLAUDE.md, dependency policy, CI scan
```

Why:

```text
Controls supply-chain risk.
```

## Security/PII Rules

Where:

```text
Security policy, logging policy, CI scan
```

Why:

```text
Prevents sensitive data leakage.
```

## Rollback Expectations

Where:

```text
PR template, runbook
```

Why:

```text
Required before production change.
```

## CI Enforcement

Where:

```text
GitHub Actions / pipeline
```

Why:

```text
Automates quality gates.
```
