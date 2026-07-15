# Simulation Brief — Promotional Discount Codes

## Change Request

```text
Add support for promotional discount codes during checkout.
```

## Business Intent

Marketing wants to run promotional campaigns such as:

```text
SAVE10
SUMMER25
VIP20
```

## Expected Customer Experience

Customers can enter a promo code during checkout and see:

```text
discount amount
updated total
clear rejection reason if not accepted
```

## Hidden Complexity

The feature affects:

```text
pricing
tax
payment amount
refunds
analytics
support
fraud controls
data model
observability
API contracts
```

## Architect Instruction

Do not allow implementation until blast radius is documented and approvals are identified.
