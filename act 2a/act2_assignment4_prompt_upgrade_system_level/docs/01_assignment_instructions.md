# Assignment Instructions

## Scenario

A developer writes:

```text
Fix the bug in CheckoutService.java.
```

The bug is a checkout failure.

The developer assumes the issue must be inside `CheckoutService.java`.

But the failure may involve:

```text
CheckoutController.java
CheckoutService.java
PricingCalculator.java
CouponValidator.java
PaymentClient.java
CheckoutServiceTest.java
CouponValidatorTest.java
API contract
CLAUDE.md repository guidance
```

## Architect Task

Rewrite the prompt so Claude Code investigates at the system level before modifying code.

## Required Elements

Your upgraded prompt must include:

```text
1. Analyze first.
2. Do not modify files yet.
3. Identify related files.
4. Explain current behavior.
5. Identify possible root causes.
6. Identify tests that cover the behavior.
7. List risks.
8. Ask for approval before coding.
```

## Output

Write your upgraded prompt in:

```text
worksheets/participant_prompt_upgrade_worksheet.md
```

## Pair Discussion

Discuss:

```text
What changed when you moved from file-level prompting to system-level prompting?
```

## Key Lesson

```text
File-level prompts produce local fixes.
Architecture-level prompts protect system behavior.
```
