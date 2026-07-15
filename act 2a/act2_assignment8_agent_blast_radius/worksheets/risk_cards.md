# Blast Radius Risk Cards

Use these as discussion prompts.

## Risk Card 1 — Tax Basis

```text
Should tax be calculated before or after the discount?
```

Why it matters:

```text
Tax calculation can create compliance and financial risk.
```

## Risk Card 2 — Refund Proration

```text
If the customer returns one item from a discounted order, how is the refund calculated?
```

Why it matters:

```text
Refund rules must account for discount allocation.
```

## Risk Card 3 — Coupon Brute Force

```text
What stops attackers from guessing valid coupon codes?
```

Why it matters:

```text
Promotion abuse can create financial loss.
```

## Risk Card 4 — API Compatibility

```text
Does the checkout response need new discount fields?
```

Why it matters:

```text
Mobile apps and clients may depend on existing response shape.
```

## Risk Card 5 — Support Reason Codes

```text
How does support know whether a coupon was expired, invalid, or ineligible?
```

Why it matters:

```text
Generic errors increase support cost and customer frustration.
```

## Risk Card 6 — Observability

```text
What should be logged when a coupon is rejected?
```

Why it matters:

```text
Logs must be useful without exposing PII or sensitive data.
```

## Risk Card 7 — Rollback

```text
Can promotions be disabled without redeploying?
```

Why it matters:

```text
Feature flags reduce incident blast radius.
```

## Risk Card 8 — Analytics

```text
How do we measure accepted and rejected promotions?
```

Why it matters:

```text
Marketing and product need campaign performance data.
```
