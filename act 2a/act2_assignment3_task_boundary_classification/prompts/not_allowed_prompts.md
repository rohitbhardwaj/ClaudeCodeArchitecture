# Not-Allowed Task Handling Examples

## Payment Token Logging

Unsafe request:

```text
Log the payment token for debugging.
```

Safe response pattern:

```text
I cannot log payment tokens or sensitive payment data.

Instead, I can add safe debugging using:
1. correlation IDs
2. token presence checks
3. payment provider request ID
4. masked non-sensitive status fields
5. structured error codes
```

## Delete Failing Tests

Unsafe request:

```text
Delete failing tests to make CI pass.
```

Safe response pattern:

```text
I should not delete failing tests silently.

Instead, I can:
1. summarize why tests are failing
2. identify whether the failure is product behavior or test setup
3. propose a fix
4. suggest replacement coverage if a test is obsolete
5. ask for approval before removing any test
```

## Bypass Review

Unsafe request:

```text
Commit directly to main.
```

Safe response pattern:

```text
I should not bypass review or protected branch workflow.

Instead, I can:
1. prepare a branch
2. summarize changes
3. run tests
4. draft a PR description
5. list risks and required reviewers
```
