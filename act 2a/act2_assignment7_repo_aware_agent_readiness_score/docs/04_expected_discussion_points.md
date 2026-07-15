# Expected Discussion Points

## Strong Discussion Themes

Participants should discover that Claude Code readiness depends on repository maturity.

## Common Low Scores

Teams often score low on:

```text
CLAUDE.md
logging/PII rules
rollback patterns
ADRs/design docs
CODEOWNERS
API contract documentation
```

## Common Overconfidence

Teams may overestimate readiness because:

```text
tests exist but are weak
README exists but is stale
CI runs but has few quality gates
architecture boundaries are tribal knowledge
security rules are not written down
```

## Best Reflection Answers

Strong answers identify one practical improvement, such as:

```text
Add CLAUDE.md with approval boundaries.
Add CODEOWNERS for auth/payment/API/migrations.
Add API contract tests.
Document logging and PII rules.
Add characterization tests for legacy modules.
Create rollback playbooks.
```

## Key Facilitator Point

Claude Code will amplify whatever repository quality exists.

A mature repo gives Claude better context.

An immature repo gives Claude ambiguity.
