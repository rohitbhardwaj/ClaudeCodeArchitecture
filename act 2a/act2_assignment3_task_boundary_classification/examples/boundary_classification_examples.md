# Boundary Classification Examples

## Safe Now

```text
Explain how checkout works.
Summarize a PR.
Create an ADR draft.
Suggest a refactoring plan without coding.
Run approved test command and summarize failures.
```

## Needs Approval

```text
Change public API error codes.
Add a new dependency.
Modify payment retry logic.
Modify database migration.
Refactor a helper inside payment or auth.
```

## Not Allowed

```text
Log payment token for debugging.
Bypass review and commit to main.
Delete failing tests silently.
Disable CI to merge.
Expose secrets.
```

## Teaching Point

The same verb can have different risk depending on context.

Example:

```text
Refactor helper method in a formatting utility = often safe.
Refactor helper method in payment authorization = needs approval.
```
