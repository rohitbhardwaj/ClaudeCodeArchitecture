# Act 2 Assignment 4 — Prompt Upgrade: From File-Level to System-Level

## Theme

File-level prompts produce local fixes.

Architecture-level prompts protect system behavior.

## Scenario

A developer writes:

```text
Fix the bug in CheckoutService.java.
```

The problem: the bug may not live only in that file.

Checkout behavior can span:

```text
CheckoutController.java
CheckoutService.java
PricingCalculator.java
CouponValidator.java
PaymentClient.java
CheckoutServiceTest.java
CouponValidatorTest.java
openapi.yaml
CLAUDE.md
```

## Architect Task

Rewrite the prompt so Claude Code investigates at the system level first.

## Required Elements

The upgraded prompt must include:

```text
Analyze first.
Do not modify files yet.
Identify related files.
Explain current behavior.
Identify possible root causes.
Identify tests that cover the behavior.
List risks.
Ask for approval before coding.
```

## Included Artifacts

- Assignment instructions
- File-level vs system-level prompting guide
- Participant prompt rewrite worksheet
- Pair discussion guide
- Strong sample answer
- Facilitator guide
- Debrief script
- Scoring rubric
- Weak prompt and upgraded prompt
- Reusable prompt templates
- Practical source files for a checkout simulation
- OpenAPI checkout contract
- CLAUDE.md repository guidance
- Tests demonstrating behavior
- One-page handout

## Source Simulation

See:

```text
source/checkout-service/
```

The simulation intentionally shows a checkout failure where the bug looks like it might be in `CheckoutService.java`, but a system-level investigation points to coupon normalization, API error behavior, tests, and repository guidance.

## Key Lesson

```text
File-level prompts produce local fixes.
Architecture-level prompts protect system behavior.
```
