# CLAUDE.md Readiness Template

Copy or adapt this into a repository-level CLAUDE.md.

```markdown
# CLAUDE.md

## Repository Purpose

[Describe what this repository does.]

## Architecture Boundaries

- Entry points:
- Core business logic:
- Data/persistence:
- External dependencies:
- Tests:
- API contracts:

## Claude May Do

- Explain code.
- Map dependencies.
- Draft documentation.
- Suggest tests.
- Summarize PR risks.
- Suggest refactoring plans without coding.

## Claude Must Ask First

- Modify production behavior.
- Change public APIs.
- Modify auth or authorization.
- Modify payment, pricing, tax, or refund behavior.
- Add dependencies.
- Modify data migrations.
- Change CI/CD.
- Remove or replace tests.

## Claude Must Never Do

- Expose secrets.
- Log PII or payment tokens.
- Delete tests silently.
- Weaken assertions.
- Bypass review.
- Commit directly to protected branches.
- Disable quality gates.

## Test Expectations

- Preserve existing behavior.
- Add characterization tests before refactoring legacy code.
- Do not remove or weaken tests without approval.

## Security and Logging Rules

- Do not log secrets, payment tokens, email addresses, or PII.
- Use correlation IDs and approved audit fields.

## Review Ownership

[Link to CODEOWNERS or review policy.]

## Rollback

[Describe feature flag, revert, migration rollback, or deployment rollback guidance.]
```
