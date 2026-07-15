# CLAUDE.md

## Plan Before Code

Before modifying production code, Claude must analyze the request and wait for approval.

## Boundaries

- Controllers handle transport only.
- Services orchestrate use cases.
- Domain policies own business rules.
- Public API error codes must be preserved unless approved.
- Do not delete tests silently.
- Do not log PII.
