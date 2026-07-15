# Assignment 1 — The Vibe Coding Incident Simulation

## Scenario

You are the architect reviewing a pull request created after a developer used Claude Code with this prompt:

```text
Clean up the OrderService and add tests.
```

Claude generated a PR that:

- Refactored `OrderService`
- Changed validation logic
- Updated unit tests
- Removed two “flaky” tests
- Added a new helper class
- Changed one API error response
- All tests are green

## Your Role

You are reviewing this PR as if it is going to production today.

Do not ask only:

```text
Does the code look cleaner?
```

Ask:

```text
What behavior changed?
What controls disappeared?
What tests were weakened?
What risk entered production?
```

## Step 1 — Identify Risks

Use these categories:

| Category | Question |
|---|---|
| Behavior | Did the public behavior change? |
| Architecture | Did the service boundaries improve or drift? |
| Testing | Were tests strengthened or weakened? |
| Security | Was validation, authorization, or logging affected? |
| Maintainability | Did the code become clearer or more coupled? |
| Reviewability | Is the change too broad to review safely? |

## Step 2 — Decide the PR Outcome

Choose one:

```text
A. Approve
B. Request changes
C. Split into smaller PRs
D. Reject and restart with a plan-first prompt
```

## Best Answer

The best answer is usually:

```text
D. Reject and restart with a plan-first prompt
```

A softer answer may be:

```text
C. Split into smaller PRs
```

But the generated refactor contains security regressions and behavior changes, so rejection is justified.
