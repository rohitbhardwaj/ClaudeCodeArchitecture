# CI Guardrails Example

Use CI/CD checks to reinforce Claude Code governance.

## Recommended Checks

```text
unit tests
integration tests
secret scanning
PII logging scanner
dependency vulnerability scan
license scan
API contract diff
database migration safety check
test deletion detection
coverage threshold
linting
static analysis
```

## Example Policy

```text
A Claude-generated PR cannot merge if:
- tests fail
- coverage drops without approval
- public API contract changes without approval
- database migration is unsafe
- secrets are detected
- PII appears in logs
- security scan fails
- protected files changed without CODEOWNER approval
```

## Teaching Point

Prompts guide behavior.

CI/CD enforces behavior.
