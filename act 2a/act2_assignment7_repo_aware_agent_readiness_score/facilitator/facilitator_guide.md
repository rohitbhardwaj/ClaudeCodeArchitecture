# Facilitator Guide — Repo-Aware Agent Readiness Score

## Learning Objective

Participants learn that Claude Code adoption depends on repository maturity, not only tool access.

## Setup Script

Say:

```text
Before we ask whether developers can use Claude Code, we should ask whether the repository is ready for a repo-aware agent.
A messy repo gives Claude ambiguous context.
A mature repo gives Claude guardrails.
```

## Timing

### Conference Version

| Segment | Time |
|---|---:|
| Explain scorecard | 3 min |
| Individual scoring | 8 min |
| Pair discussion | 4 min |
| Debrief | 4 min |

Total: 19 minutes

### Workshop Version

| Segment | Time |
|---|---:|
| Explain dimensions | 8 min |
| Individual scoring | 12 min |
| Pair discussion | 8 min |
| Improvement backlog | 8 min |
| Debrief | 5 min |

Total: 41 minutes

## Facilitation Prompts

Ask:

```text
Which dimension scored lowest?
Which dimension would most improve Claude Code safety?
Where are rules still tribal knowledge?
What would Claude misunderstand in this repo?
What should be added before team-wide rollout?
```

## Common Mistake

Participants may score too generously.

Push for evidence:

```text
Where is that documented?
Which test proves it?
Which CI gate enforces it?
Who owns that file?
Where is the rollback plan?
```

## Strong Closing Line

Claude Code adoption is not only a tooling decision. It is a repository maturity decision.
