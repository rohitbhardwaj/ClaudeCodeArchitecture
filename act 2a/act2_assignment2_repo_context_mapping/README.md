# Act 2 Assignment 2 — Repo Context Mapping Simulation

## Theme

Repo-aware work starts with repo context, not code generation.

## Scenario

Claude Code is asked to help with a checkout failure.

The weak prompt is:

```text
Fix the checkout bug.
```

But checkout behavior depends on many files:

```text
CheckoutController
CheckoutService
PricingCalculator
CouponValidator
PaymentClient
OrderRepository
CheckoutServiceTest
CouponValidatorTest
openapi.yaml
CLAUDE.md
```

## Architect Task

Participants create a repo context map before allowing Claude to modify code.

## Context Map Template

```text
Feature / bug: Checkout failure

1. Entry point:
2. Core business logic:
3. External dependencies:
4. Data/persistence:
5. Tests:
6. API contract:
7. Security-sensitive areas:
8. Files Claude may inspect:
9. Files Claude may modify only after approval:
10. Files Claude must not modify:
```

## Included Artifacts

- Assignment instructions
- Repo-context mapping guide
- Participant worksheet
- Blank context map template
- Strong sample answer
- Facilitator guide
- Debrief script
- Scoring rubric
- Weak and strong prompts
- Practical checkout repo simulation
- File responsibility map
- Risk checklist
- CLAUDE.md context-mapping rule template
- One-page handout

## Key Lesson

```text
Repo-aware work starts with repo context, not code generation.
```
