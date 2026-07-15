# CLAUDE.md — Diff Review Rule

```markdown
## AI-Generated Diff Review

Claude-generated diffs must be reviewed for:
- architecture boundaries
- public API behavior
- PII/logging safety
- existing test preservation
- removed tests
- weakened assertions
- failure-path coverage
- rollback plan
- required approvals

Block diffs that:
- move domain logic into controllers
- change public error codes without approval
- log PII
- remove failing tests
- add only happy-path tests
- omit rollback
- omit approval owners
```
