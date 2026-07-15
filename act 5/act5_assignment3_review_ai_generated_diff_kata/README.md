# Act 5 Assignment 3 — Review the AI-Generated Diff Kata

## Theme

Reviewing Claude’s diff is not just code review; it is architecture, safety, and governance review.

## Scenario

Claude generated a diff for a checkout bug.

The diff:

```text
moves coupon validation into controller
changes INVALID_COUPON to COUPON_FAILED
logs customer email
removes a failing test
adds one happy-path test
does not mention rollback
```

## Architect Task

Review the diff and decide whether to:

```text
approve
request changes
block
```

## Strong Review Decision

```text
Block the diff.
```

## Included Artifacts

- Assignment instructions
- AI-generated diff review kata guide
- Participant worksheet
- Review checklist
- Finding cards
- Quick kata scorecard
- Strong review decision
- Safer response to Claude
- Facilitator guide
- Debrief script
- Scoring rubric
- Bad diff patch
- Bad PR description
- Safe revised plan
- Prompt templates
- CLAUDE.md diff-review rule
- PR review checklist
- Source repo simulation
- One-page handout
