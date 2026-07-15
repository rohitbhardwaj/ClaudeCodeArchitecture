# Review Prompts

## PR Risk Summary

```text
Review this PR for risk.

Do not modify files.

Return:
1. Summary of changes.
2. Files changed.
3. Behavior changes.
4. Tests added/removed/changed.
5. Architecture risks.
6. Security risks.
7. API risks.
8. Rollback risks.
9. Review questions.
```

## Quality Gate Check

```text
Check this PR against our quality gates.

Evaluate:
1. SOLID/design boundaries.
2. Security.
3. Test quality.
4. Observability.
5. API compatibility.
6. Performance.
7. Maintainability.

Do not approve or merge.
```
