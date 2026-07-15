# Checkout File Responsibility Map

Use this to help participants understand the simulated repository.

| File | Responsibility | Risk if changed incorrectly |
|---|---|---|
| CheckoutController | REST entry point | API behavior, status codes, validation |
| CheckoutService | Orchestrates checkout flow | Business behavior, payment flow, order creation |
| PricingCalculator | Calculates subtotal, discounts, tax, total | Pricing/tax correctness, revenue impact |
| CouponValidator | Validates coupon rules | Customer experience, abuse controls |
| PaymentClient | External payment boundary | Incorrect charges, payment failures |
| InventoryClient | External inventory boundary | Selling unavailable products |
| TaxService | External tax boundary | Compliance and financial accuracy |
| OrderRepository | Persists orders | Data integrity, support/refund issues |
| CheckoutServiceTest | Unit tests for checkout flow | Behavior protection |
| CouponValidatorTest | Unit tests for coupon behavior | Coupon compatibility |
| openapi.yaml | Public API contract | Client compatibility |
| CLAUDE.md | Repo-specific guidance | Agent behavior and guardrails |

## Teaching Point

A bug report may mention “checkout,” but the real context spans code, tests, APIs, data, and governance.
