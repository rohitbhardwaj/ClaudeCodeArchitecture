# Act 2 Assignment 7 — Repo-Aware Agent Readiness Score

## Theme

Claude Code adoption is not only a tooling decision.

It is a repository maturity decision.

## Scenario

Before rolling out Claude Code widely, your team wants to know whether a repository is ready.

## Architect Task

Score a repository from 1 to 5 across readiness dimensions.

## Readiness Dimensions

```text
Clear repository structure
Good README
Strong CLAUDE.md
Existing tests
API contracts documented
Architecture boundaries clear
Security rules documented
Logging/PII rules documented
CI/CD quality gates
CODEOWNERS/review ownership
Rollback patterns
ADRs or design docs
```

## Scoring Guide

```text
1 = not ready
2 = risky
3 = usable with caution
4 = ready for controlled use
5 = strong governed engineering environment
```

## Recommended Interpretation

```text
12–25: Do not scale Claude Code yet.
26–40: Use Claude Code only for read-only analysis and draft docs.
41–50: Allow small changes with review.
51–60: Ready for controlled team adoption.
```

## Reflection Question

```text
What one repository improvement would most improve your Claude Code readiness score?
```

## Included Artifacts

- Assignment instructions
- Readiness scorecard worksheet
- Evidence checklist
- Scoring guide
- Interpretation guide
- Facilitator guide
- Debrief script
- Scoring rubric
- Sample completed assessment
- Repository improvement backlog template
- 30/60/90-day readiness plan
- CLAUDE.md readiness template
- CODEOWNERS starter
- CI/CD quality gate checklist
- Prompt library for repo readiness assessment
- One-page handout
