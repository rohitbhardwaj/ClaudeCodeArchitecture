# Quality Gate Checklist for Claude-Generated PRs

## Behavior Preservation

- [ ] Existing behavior summarized before coding.
- [ ] Behavior changes explicitly listed.
- [ ] Characterization tests added for existing behavior.
- [ ] Customer-visible behavior reviewed.

## Architecture

- [ ] Boundaries preserved.
- [ ] No hidden coupling introduced.
- [ ] Change is small and reviewable.
- [ ] Risk and rollback plan included.

## Security and Privacy

- [ ] No secrets logged.
- [ ] No PII logged.
- [ ] Validation behavior reviewed.
- [ ] Abuse cases considered.
- [ ] Security owner approval when required.

## Tests

- [ ] Tests cover happy path.
- [ ] Tests cover failure paths.
- [ ] Existing tests not deleted silently.
- [ ] Assertions not weakened.
- [ ] Contract tests updated only with approval.

## Product and Support

- [ ] Support reason codes preserved or approved.
- [ ] Customer-visible messages reviewed.
- [ ] Product owner approves behavior change.
- [ ] Support team can diagnose failures.

## Rollback

- [ ] Feature flag exists where appropriate.
- [ ] Revert plan documented.
- [ ] Monitoring exists for failure signals.
