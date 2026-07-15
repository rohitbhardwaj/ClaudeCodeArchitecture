# CLAUDE.md Rule — System-Level Prompting

Copy or adapt this into CLAUDE.md.

```markdown
## System-Level Investigation Requirement

For production bugs, multi-file tasks, or behavior-sensitive changes, Claude must not immediately edit the named file.

Before coding, Claude must:

1. Analyze the issue.
2. Identify related files.
3. Explain current behavior.
4. Identify possible root causes.
5. Identify tests that cover the behavior.
6. List missing tests.
7. List security, API, data, and rollback risks.
8. Propose a small-step plan.
9. Ask for approval before modifying files.

Claude must preserve:
- public API behavior
- payment behavior
- pricing behavior
- tax behavior
- coupon behavior
- existing tests
- security-sensitive logging rules

Claude must not:
- remove or weaken tests
- log sensitive data
- change high-risk behavior without approval
```
