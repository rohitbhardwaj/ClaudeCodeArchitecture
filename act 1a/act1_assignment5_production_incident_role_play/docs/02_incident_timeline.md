# Incident Timeline

## Day 0 — Developer Prompt

Developer asks Claude Code:

```text
Improve checkout discount handling and clean up pricing logic.
Make the code more production ready.
Update tests.
```

## Day 0 — Claude-Generated PR

PR title:

```text
Refactor checkout pricing and improve discount validation
```

Claude summary:

```text
- Refactored discount validation.
- Consolidated pricing logic.
- Updated checkout tests.
- Added safer logging.
- All tests pass.
```

## Day 1 — PR Merged

The PR was reviewed quickly because:

```text
tests passed
code looked cleaner
discount logic appeared simpler
release deadline was close
```

## Day 2 — Production Symptoms

Monitoring shows:

```text
checkout error rate increased from 1.2% to 5.8%
coupon rejection rate increased from 3% to 18%
support tickets increased by 42%
tests are still passing in CI
```

## Day 2 — Security Signal

A support engineer notices logs like:

```text
customerEmail=ro***@example.com
coupon=SUMMER25
reason=invalid coupon
```

## Day 2 — Customer Impact

Customers report:

```text
valid coupons are rejected
checkout sometimes fails
support cannot explain why a coupon was rejected
some customers abandoned carts
```

## Day 2 — Incident Review

Your group is now investigating what happened.
