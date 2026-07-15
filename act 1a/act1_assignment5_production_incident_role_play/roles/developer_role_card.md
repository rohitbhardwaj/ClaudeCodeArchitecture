# Role Card — Developer

## Your Perspective

You used Claude Code to improve checkout discount handling.

You were trying to move quickly and clean up confusing code before a release.

## Prompt Used

```text
Improve checkout discount handling and clean up pricing logic.
Make the code more production ready.
Update tests.
```

## What You Thought Claude Did

```text
simplified coupon validation
cleaned up pricing logic
updated tests
made logs easier to understand
```

## Files Changed

```text
CheckoutService.java
CouponValidator.java
PricingCalculator.java
CheckoutLogger.java
CheckoutServiceTest.java
CouponValidatorTest.java
```

## Your Role Task

Explain:

```text
1. What prompt was used?
2. What files changed?
3. What did Claude claim it changed?
4. What tests were run?
5. What did you miss before merge?
```

## Reflection

What should you have asked Claude to do before modifying files?

Suggested answer:

```text
Analyze current coupon behavior first.
List current validation rules.
Identify behavior that must remain unchanged.
Propose a small-step plan.
Wait for approval before coding.
```
