# Prompt Quality Checklist

Use this checklist to evaluate upgraded prompts.

## Analysis First

```text
[ ] The prompt says do not modify files yet.
[ ] The prompt asks Claude to inspect related files.
[ ] The prompt asks Claude to explain current behavior.
```

## System Context

```text
[ ] The prompt includes controller/entry point.
[ ] The prompt includes service/business logic.
[ ] The prompt includes helper/validator/calculator classes.
[ ] The prompt includes tests.
[ ] The prompt includes API contract.
[ ] The prompt includes CLAUDE.md.
```

## Risk Awareness

```text
[ ] The prompt asks for possible root causes.
[ ] The prompt asks for impacted files.
[ ] The prompt asks for security risks.
[ ] The prompt asks for API risks.
[ ] The prompt asks for rollback risk.
```

## Constraints

```text
[ ] Preserve public API behavior.
[ ] Do not change payment behavior without approval.
[ ] Do not change pricing/tax/coupon behavior without approval.
[ ] Do not remove or weaken tests.
[ ] Do not log sensitive data.
```

## Approval

```text
[ ] The prompt asks Claude to wait for approval before coding.
[ ] The prompt requests a small-step fix plan.
```
