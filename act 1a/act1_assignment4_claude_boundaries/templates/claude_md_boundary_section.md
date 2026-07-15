# CLAUDE.md Boundary Section Template

Copy this into a repository-level CLAUDE.md file.

```markdown
## Claude Code Boundaries

### Claude may do without special approval

- Explain existing code.
- Summarize modules, flows, and dependencies.
- Generate draft documentation.
- Suggest refactoring options.
- Generate draft tests for human review.
- Analyze risks and identify code smells.
- Produce implementation plans without modifying files.

### Claude must ask first before doing

- Modifying authentication or authorization logic.
- Changing payment, pricing, billing, tax, refund, or discount behavior.
- Changing public API contracts, response fields, or error codes.
- Adding, removing, or upgrading dependencies.
- Modifying database schemas, migrations, or data access patterns.
- Changing CI/CD workflows or deployment configuration.
- Performing broad refactors across multiple modules.
- Modifying production configuration.
- Removing or replacing existing tests.
- Changing logging, audit, or observability behavior.

### Claude must never do

- Expose secrets, tokens, passwords, keys, or credentials.
- Log PII, payment tokens, secrets, or sensitive customer data.
- Delete tests silently.
- Weaken assertions to make tests pass.
- Bypass pull request review.
- Commit directly to protected branches.
- Disable security scans, linting, or test gates.
- Hide failing tests or errors.
- Print environment variables broadly.
- Remove audit logging without approval.

### Required workflow for risky changes

Before modifying files, Claude must:

1. Summarize current behavior.
2. Identify impacted files.
3. Explain risks.
4. Propose a small-step plan.
5. List tests to add or update.
6. Ask for approval.
```
