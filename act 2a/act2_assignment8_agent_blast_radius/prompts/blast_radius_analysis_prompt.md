# Blast Radius Analysis Prompt

Use this before allowing Claude to implement a change.

```text
Analyze the blast radius for this change before modifying files.

Change:
Add support for promotional discount codes during checkout.

Do not modify files.

Return impact across:
1. User-visible behavior
2. API contract
3. Pricing
4. Tax
5. Payment
6. Refunds
7. Fraud/abuse
8. Data model
9. Analytics
10. Support
11. Observability
12. Tests
13. Rollback
14. Required approvals

For each area, include:
- what may change
- risk level
- required tests
- approval owner

Wait for approval before coding.
```
