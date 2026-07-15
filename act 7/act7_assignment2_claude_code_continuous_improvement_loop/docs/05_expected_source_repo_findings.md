# Expected Findings from Source Repo

The source repo demonstrates a monthly improvement loop.

Participants should find:

| Feedback source | Example artifact |
|---|---|
| Claude-assisted PRs | `reports/monthly-pr-review-summary.csv` |
| Review comments | `reports/review-comment-themes.json` |
| Failed CI checks | `.github/workflows/ci.yml`, `reports/ci-failures.csv` |
| Security findings | `docs/security/security-findings.md` |
| Rollbacks/incidents | `reports/rollback-incident-summary.md` |
| Developer feedback | `docs/training/developer-feedback.md` |
| Reviewer feedback | `docs/training/reviewer-feedback.md` |
| Prompt failures | `docs/prompts/prompt-failure-log.md` |

## Correct Improvement Actions

```text
Update CLAUDE.md.
Update reusable prompts.
Update PR template.
Strengthen CI gates.
Add reviewer checklist item.
Add one new kata.
Publish monthly learning summary.
```
