# Decision Principles

## Principle 1 — Automation Can Assist Judgment, Not Replace Accountability

Claude can help gather information, summarize evidence, and propose options.

A human must own accountable decisions.

## Principle 2 — High-Blast-Radius Decisions Stay Human

Keep human decision rights for:

```text
architecture style
public API changes
payment behavior
production release
rollback
security approval
data migrations
```

## Principle 3 — Drafting Is Not Approval

Claude can draft:

```text
ADRs
PR summaries
release notes
test cases
risk lists
```

But humans must approve.

## Principle 4 — Evidence Is Automatable

Claude can summarize:

```text
logs
diffs
tests
incident evidence
dependency maps
```

But humans must judge what the evidence means.

## Principle 5 — Tests Are Shared

Claude can generate tests, but humans must confirm:

```text
assertions are meaningful
old behavior is preserved
failure paths are covered
tests were not weakened
```

## Principle 6 — Production Decisions Stay Human

Claude should not independently:

```text
merge PRs
approve releases
decide rollback
approve API changes
decide payment behavior
```
