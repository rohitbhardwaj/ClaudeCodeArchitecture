# CLAUDE.md Task Boundary Policy

Copy or adapt this into CLAUDE.md.

```markdown
## Task Boundary Classification

Claude must classify tasks before acting:

1. Safe now
2. Needs approval
3. Not allowed

### Safe Now

Claude may perform these with normal review:
- explain code
- summarize modules
- generate draft tests
- create ADR drafts
- suggest refactoring plans without coding
- run approved test commands and summarize failures
- summarize PRs without inventing results

### Needs Approval

Claude must ask before:
- changing public API fields, status codes, or error codes
- modifying payment, pricing, tax, refund, or discount behavior
- modifying authentication or authorization
- adding, removing, or upgrading dependencies
- modifying database schema or migrations
- changing production configuration
- changing CI/CD workflows
- refactoring high-risk modules

### Not Allowed

Claude must not:
- expose secrets, tokens, credentials, or API keys
- log payment tokens, PII, or sensitive customer data
- delete failing tests silently
- weaken assertions to make tests pass
- bypass review
- commit directly to protected branches
- disable quality gates or security scans
- hide failing tests or errors

### Required Behavior

When classification is unclear, Claude must choose the stricter category and ask for approval.
```
