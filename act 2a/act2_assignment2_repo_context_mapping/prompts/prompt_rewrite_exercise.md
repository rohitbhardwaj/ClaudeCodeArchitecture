# Prompt Rewrite Exercise

## Starting Prompt

```text
Fix the checkout bug.
```

## Rewrite Task

Rewrite the prompt so Claude first maps repository context.

Your prompt must include:

```text
analyze first
do not modify files yet
inspect related files
summarize current behavior
identify impacted files
identify tests
identify API risks
identify security risks
ask for approval before coding
```

## Strong Answer Pattern

```text
Analyze the checkout failure before modifying files.

Do not change code yet.

First inspect the controller, service, pricing, coupon, payment, persistence, tests, API contract, and CLAUDE.md.

Then summarize current behavior, likely root causes, impacted files, missing tests, API risks, security risks, and a small-step fix plan.

Wait for approval before modifying files.
```
