# Assignment Instructions

## Scenario

A developer asked Claude Code to add discount support to the checkout module.

Claude returned a working implementation.

The PR summary says:

```text
Added discount support to checkout.
Updated tests.
Refactored pricing logic.
```

The code compiles and tests pass.

## Your Role

You are the architect reviewing the PR.

Your task is to produce an Architecture Risk Radar.

## What You Should Inspect

Look for these risk areas:

1. Behavior risk
2. API compatibility risk
3. Data model risk
4. Security risk
5. Test quality risk
6. Coupling risk
7. Observability risk
8. Rollback risk
9. Human approval required
10. Final decision

## Important Review Mindset

Do not only ask:

```text
Does the code work?
```

Ask:

```text
What behavior changed?
What systems are affected?
What contracts were changed?
What tests were weakened?
What production controls are missing?
Can we safely roll this back?
```

## Output

Fill out the risk radar worksheet in:

```text
worksheets/participant_risk_radar_worksheet.md
```
