# CLAUDE.md — Safe / Ask / Never Rule

```markdown
## Safe / Ask / Never

### Safe

Claude may proceed with:
- explaining unfamiliar code
- summarizing dependencies
- drafting documentation
- drafting tests without replacing existing tests

### Ask First

Claude must ask before:
- refactoring structure
- changing public API behavior
- adding dependencies
- modifying payment, pricing, tax, or refund logic
- changing CI/CD
- changing tests that protect production behavior

### Never

Claude must never:
- log PII
- remove failing tests silently
- weaken assertions to make tests pass
- bypass approval owners
- hide Claude involvement in PRs
```
