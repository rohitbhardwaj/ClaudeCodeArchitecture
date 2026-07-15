# CODEOWNERS for Incident Prevention

Example CODEOWNERS rules that could have forced review.

```text
# Checkout and coupon behavior require architecture + product approval
/src/main/java/**/checkout/**       @architecture-team @product-checkout
/src/main/java/**/coupon/**         @architecture-team @product-growth

# Payment and pricing require architecture + finance approval
/src/main/java/**/payment/**        @architecture-team @payments-team
/src/main/java/**/pricing/**        @architecture-team @finance-systems

# Logging changes require security approval
/src/main/java/**/logging/**        @security-team
/src/main/java/**/audit/**          @security-team

# API contracts require API governance approval
/openapi/**                         @api-governance-team @architecture-team
```

## Teaching Point

Prompts are not enough.

Repository ownership rules should enforce review for high-risk areas.
