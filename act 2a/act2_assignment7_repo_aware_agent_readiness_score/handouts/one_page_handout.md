# One-Page Handout — Repo-Aware Agent Readiness Score

## Score Each Dimension 1–5

| Dimension | Score |
|---|---:|
| Clear repository structure |  |
| Good README |  |
| Strong CLAUDE.md |  |
| Existing tests |  |
| API contracts documented |  |
| Architecture boundaries clear |  |
| Security rules documented |  |
| Logging/PII rules documented |  |
| CI/CD quality gates |  |
| CODEOWNERS/review ownership |  |
| Rollback patterns |  |
| ADRs or design docs |  |

## Scoring Guide

```text
1 = not ready
2 = risky
3 = usable with caution
4 = ready for controlled use
5 = strong governed engineering environment
```

## Interpretation

```text
12–25: Do not scale Claude Code yet.
26–40: Use Claude Code only for read-only analysis and draft docs.
41–50: Allow small changes with review.
51–60: Ready for controlled team adoption.
```

## Reflection

```text
What one repository improvement would most improve your Claude Code readiness score?
```

## Key Lesson

```text
Claude Code adoption is not only a tooling decision.
It is a repository maturity decision.
```
