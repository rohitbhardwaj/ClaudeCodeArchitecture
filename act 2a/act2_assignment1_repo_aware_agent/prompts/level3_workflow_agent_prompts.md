# Level 3 — Engineering Workflow Agent Prompt Examples

## PR Summary

```text
Draft a pull request summary for the current changes.

Include:
1. What changed.
2. Why it changed.
3. Files changed.
4. Tests run.
5. Architecture impact.
6. Security impact.
7. Rollback risk.
8. Follow-up work.

Do not claim tests passed unless they were actually run.
```

## Test Interpretation

```text
Run the relevant test command and interpret failures.

If tests fail:
1. Summarize failing tests.
2. Identify likely root causes.
3. Separate product failures from test setup failures.
4. Propose next steps.

Do not weaken tests to make them pass.
```

## Quality Gate Proposal

```text
Propose quality gates for this repository.

Analyze:
1. Test coverage.
2. Security scanning.
3. API contract checks.
4. CODEOWNERS.
5. Secret scanning.
6. Dependency scanning.
7. Architecture review needs.
8. PR template requirements.

Return a phased adoption plan.
```

## Governance Note

Level 3 prompts require strong human accountability because Claude is participating in engineering workflow.
