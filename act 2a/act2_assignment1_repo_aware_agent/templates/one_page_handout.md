# One-Page Handout — From Coding Assistant to Repo-Aware Agent

## Three Levels

```text
Level 1 — Code helper
Level 2 — Repo-aware assistant
Level 3 — Engineering workflow agent
```

## Level 1

Claude helps write or explain local code.

Examples:

```text
generate utility function
explain method
draft simple tests
```

Control needed:

```text
code review
```

## Level 2

Claude understands the repository.

Examples:

```text
map dependencies
generate tests from existing behavior
analyze architecture drift
suggest migration steps
```

Controls needed:

```text
CLAUDE.md
architecture guidance
test expectations
approval boundaries
```

## Level 3

Claude participates in the engineering workflow.

Examples:

```text
create PR summary
run tests and interpret failures
update docs after changes
propose quality gates
```

Controls needed:

```text
review gates
CI/CD checks
CODEOWNERS
human accountability
```

## Key Lesson

```text
The more repo-aware Claude becomes,
the more architecture-aware your controls must become.
```

## Reflection

```text
Where is your team still treating Claude Code like autocomplete when it should be treated like a repo-aware agent?
```
