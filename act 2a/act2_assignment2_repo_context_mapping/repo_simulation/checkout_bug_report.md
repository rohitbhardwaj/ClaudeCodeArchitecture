# Simulated Bug Report

## Title

Checkout fails for some valid coupon users

## Customer Symptoms

```text
Some customers enter a valid coupon and receive a generic checkout failure.
Other customers can check out normally.
Support cannot explain the failure reason.
```

## Observed Metrics

```text
Checkout error rate increased from 1.1% to 4.9%.
Coupon rejection rate increased from 2.7% to 14.3%.
Cart abandonment after coupon entry increased from 7.8% to 13.5%.
```

## Engineering Note

A recent cleanup touched:

```text
CheckoutService
CouponValidator
PricingCalculator
CheckoutServiceTest
CouponValidatorTest
```

## Architect Question

Should Claude immediately fix `CheckoutService`, or first map the repo context?
