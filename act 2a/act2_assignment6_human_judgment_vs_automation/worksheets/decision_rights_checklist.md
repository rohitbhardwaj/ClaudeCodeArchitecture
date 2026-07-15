# Decision Rights Checklist

Use this checklist to decide whether Claude can automate, share, or must defer to humans.

## Claude Can Automate

```text
[ ] Read-only analysis
[ ] Evidence summarization
[ ] Drafting
[ ] Low-risk explanation
[ ] Proposal generation
[ ] Non-binding recommendation
```

## Shared

```text
[ ] Claude can draft but human must approve
[ ] Claude can identify risks but expert must validate
[ ] Claude can generate tests but human reviews assertions
[ ] Claude can propose refactors but human approves implementation
```

## Human Must Decide

```text
[ ] Public API commitment
[ ] Architecture style or major tradeoff
[ ] Payment, pricing, tax, or refund behavior
[ ] Security approval
[ ] Production release
[ ] Rollback
[ ] Merge to protected branch
[ ] Governance exception
[ ] Customer-impacting behavior
```

## Simple Question

```text
Who is accountable if this goes wrong?
```

If accountability belongs to a human, decision authority must stay human.
