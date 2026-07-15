# Strong Sample Answer

| Review input | What to inspect | Improvement action |
|---|---|---|
| Claude-assisted PRs | Size, scope, disclosure, tests | Update PR template and small-PR rules |
| Review comments | Repeated architecture/security issues | Update CLAUDE.md and review checklist |
| Failed CI checks | Test, lint, contract, security failures | Add better prompts and stronger CI gates |
| Security findings | PII, secrets, dependencies | Update security policy and scans |
| Rollbacks/incidents | Root cause and missed guardrail | Add approval checkpoint or test requirement |
| Developer feedback | Where Claude helped or confused | Improve runbook and training |
| Reviewer feedback | What was hard to review | Improve PR expectations |
| Repeated prompt failures | Bad instructions or missing context | Add reusable prompt templates |

## Monthly Review Agenda

```text
1. Review Claude-assisted PRs.
2. Identify repeated failure patterns.
3. Update CLAUDE.md.
4. Update prompt templates.
5. Update PR checklist.
6. Add or strengthen CI gates.
7. Add one new kata for the team.
8. Publish monthly learning summary.
```

## Key Lesson

```text
Claude Code governance is not one-time setup; it is a learning loop.
```
