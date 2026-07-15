# Strong Sample Answer

## Example Score

```text
32/50
```

## Recommendation

```text
Pilot with restrictions.
```

## Allowed Claude Code Use

Allow Claude Code for:

```text
read-only analysis
documentation
test drafting
small approved changes
```

## Not Allowed Yet

Do not allow:

```text
autonomous production-impacting changes
public API changes without approval
payment/pricing changes
dependency additions without review
CI/CD changes without platform approval
silent test deletion
PII logging
```

## Before Broader Rollout

1. Update `CLAUDE.md`.
2. Enforce CODEOWNERS.
3. Improve PR template.
4. Add API/security/dependency scans.
5. Train reviewers on AI-generated diff review.

## Key Lesson

```text
Enterprise rollout should be based on readiness evidence, not enthusiasm.
```
