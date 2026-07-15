# Assignment Instructions

## Scenario

Claude Code is asked to make a change:

```text
Add support for promotional discount codes during checkout.
```

A developer may think this is a simple feature.

An architect should think:

```text
What is the blast radius?
```

## Architect Task

Before allowing Claude to implement the change, identify affected areas.

## Blast Radius Template

```text
Change: Add promotional discount codes

1. User-visible behavior:
2. API contract:
3. Pricing:
4. Tax:
5. Payment:
6. Refunds:
7. Fraud/abuse:
8. Data model:
9. Analytics:
10. Support:
11. Observability:
12. Tests:
13. Rollback:
14. Required approvals:
```

## Output

Complete:

```text
worksheets/participant_blast_radius_worksheet.md
```

## Key Lesson

```text
Before Claude changes code, architects must understand the blast radius.
```
