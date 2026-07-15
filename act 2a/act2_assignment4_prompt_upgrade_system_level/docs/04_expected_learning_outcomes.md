# Expected Learning Outcomes

After this assignment, participants should understand:

## 1. A filename is not a system boundary

A bug report may mention one file, but the root cause may span many components.

## 2. Prompting should begin with investigation

For production code, Claude should first analyze context, behavior, tests, and risks.

## 3. Tests are part of the prompt context

The prompt should ask Claude to identify existing tests and missing tests before changing code.

## 4. API contracts must be protected

Checkout behavior may be consumed by web apps, mobile apps, support tools, and monitoring.

## 5. Approval boundaries matter

Claude should not change payment, pricing, tax, coupon, or public API behavior without approval.

## 6. System-level prompting creates better review

A system-level prompt produces a plan that humans can evaluate before code changes happen.
