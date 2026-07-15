# Simulated Pull Request Summary

## PR Title

Add discount support to checkout

## PR Description

```text
This PR adds discount-code support to checkout.

Changes:
- Added optional discountCode to CheckoutRequest.
- Refactored price calculation into PricingCalculator.
- Added discount handling.
- Updated tests.
- Simplified checkout totals.
```

## Claude-Generated Summary

```text
Implemented discount support by applying discount codes during checkout calculation.
Refactored pricing logic into a helper class to keep CheckoutService cleaner.
Updated tests to cover successful discount application.
All tests pass.
```

## Files Changed

```text
src/main/java/com/acme/checkout/CheckoutRequest.java
src/main/java/com/acme/checkout/CheckoutService.java
src/main/java/com/acme/checkout/PricingCalculator.java
src/main/java/com/acme/checkout/Receipt.java
src/test/java/com/acme/checkout/CheckoutServiceTest.java
```

## Architect Warning

This PR looks reasonable at first glance.

But the real question is:

```text
Did Claude understand the blast radius of a discount feature?
```
