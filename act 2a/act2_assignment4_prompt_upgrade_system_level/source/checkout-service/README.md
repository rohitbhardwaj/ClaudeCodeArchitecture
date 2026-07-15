# Checkout Service Source Simulation

This source folder supports Act 2 Assignment 4.

## Purpose

The simulation shows why this prompt is unsafe:

```text
Fix the bug in CheckoutService.java.
```

The bug appears in checkout, but the context spans:

```text
CheckoutController.java
CheckoutService.java
PricingCalculator.java
CouponValidator.java
PaymentClient.java
CheckoutServiceTest.java
CouponValidatorTest.java
api/openapi.yaml
CLAUDE.md
```

## Intended Participant Discovery

Participants should realize that a system-level prompt should inspect related files before editing.

## Simulated Bug

Some valid coupon codes fail checkout when entered with lowercase or surrounding whitespace.

The root cause is not necessarily in `CheckoutService.java`.

The likely root cause is in `CouponValidator.java`, where coupon normalization is incomplete.

## Teaching Point

A file-level prompt may cause Claude to patch `CheckoutService.java` by adding local coupon cleanup there.

That creates duplicated validation logic.

A system-level prompt should identify the root cause and propose a small, behavior-preserving fix.
