# CLAUDE.md

## Safe / Ask / Never

### Safe

Claude may:
- explain unfamiliar code
- summarize dependencies
- draft unit tests without replacing existing tests
- draft factual documentation

### Ask First

Claude must ask before:
- refactoring controller or service structure
- changing public API behavior
- adding dependencies
- modifying payment logic
- changing CI/CD
- modifying tests that protect production behavior

### Never

Claude must never:
- add PII logging
- remove failing tests silently
- weaken assertions to make tests pass
- bypass CODEOWNERS
- hide Claude involvement in PRs
