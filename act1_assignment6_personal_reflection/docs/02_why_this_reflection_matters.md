# Why This Reflection Matters

## The Core Problem

Many architecture rules are not written down.

They live in:

```text
senior engineers' heads
PR comments
Slack threads
tribal knowledge
architecture review meetings
incident memories
```

Claude Code cannot reliably follow rules that are not visible to it.

## The Key Shift

Before Claude Code:

```text
Architectural judgment could be corrected in code review.
```

With Claude Code:

```text
Change can be generated faster than review habits can keep up.
```

That means architecture guidance must become explicit earlier.

## The Practical Goal

Turn repeated human review comments into reusable repository guidance.

Examples:

```text
Do not put business logic in controllers.
Do not change public API error codes without approval.
Do not log customer email or payment tokens.
Do not remove tests to make a refactor pass.
Add characterization tests before refactoring legacy behavior.
```

## Key Lesson

If a rule matters repeatedly, it should not live only in someone's memory.

It should live in:

```text
CLAUDE.md
tests
lint rules
CODEOWNERS
CI/CD quality gates
architecture decision records
```
