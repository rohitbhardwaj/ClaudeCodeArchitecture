# Architect Review Questions

Use these questions during the simulation.

## Behavior

- Did discount logic change tax behavior?
- Did it affect refunds?
- Did it change the meaning of total?
- Did it preserve existing checkout behavior when no discount is supplied?

## API Compatibility

- Are response fields backward compatible?
- Will mobile/web/support clients break?
- Are error codes preserved?

## Data

- Is the discount code persisted?
- Is the discount amount persisted?
- Can finance reconcile discounted orders?
- Can support explain customer charges?

## Security

- Who is allowed to use a discount?
- Is the discount expired?
- Is the discount limited by campaign or customer segment?
- Could a user brute-force codes?
- Are discount codes or sensitive values logged?

## Testing

- Are there failure-path tests?
- Are old behaviors protected?
- Are tax and refund scenarios covered?

## Coupling

- Does checkout own promotion policy?
- Is discount logic duplicated?

## Observability

- Are discount decisions logged?
- Are accepted and rejected discounts traceable?
- Are metrics emitted?

## Rollback

- Can discounts be disabled?
- Is there a feature flag?
- What happens if promotion validation fails?

## Approval

- Who needs to approve this?
- Product?
- Security?
- Finance?
- QA?
- Architecture?
