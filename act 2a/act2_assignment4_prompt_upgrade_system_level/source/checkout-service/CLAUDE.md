# CLAUDE.md — Checkout Service

## Project Guidance

This repository contains checkout behavior for a commerce system.

## Architecture Rules

- `CheckoutController` owns HTTP request/response mapping.
- `CheckoutService` orchestrates checkout business flow.
- `PricingCalculator` owns subtotal, tax, and total calculation.
- `CouponValidator` owns coupon normalization and validation.
- `PaymentClient` is the payment boundary.
- `OrderRepository` is the persistence boundary.

## High-Risk Areas

Claude must ask before changing:

- payment behavior
- pricing behavior
- tax behavior
- coupon eligibility behavior
- public API response fields
- public API error codes
- logs containing customer or payment data

## Test Rules

- Do not remove or weaken tests.
- Add characterization tests before changing legacy behavior.
- Preserve public API behavior unless explicitly approved.

## Sensitive Data Rules

- Do not log payment tokens.
- Do not log email addresses.
- Do not log PII.
- Use correlation IDs for troubleshooting.

## System-Level Investigation Rule

For checkout bugs, do not edit the named file immediately.

First inspect:

1. Controller
2. Service
3. Pricing calculator
4. Coupon validator
5. Payment boundary
6. Tests
7. API contract
8. This CLAUDE.md file

Then propose a plan and wait for approval.
