# Scoring Rubric — Architecture Risk Radar

Score each participant or team from 1 to 5.

## 5 — Excellent

Participant identifies most of the blast radius:

```text
tax
refunds
authorization
data persistence
audit logging
API compatibility
test gaps
feature flag
coupling
human approval
```

Decision is reject or split.

## 4 — Strong

Participant identifies several major risks, especially security, tax/refund, and test quality.

Decision is revise, split, or reject.

## 3 — Acceptable

Participant identifies some risks but misses business blast radius such as tax, refunds, or finance.

Decision may be request changes.

## 2 — Weak

Participant focuses mostly on code style or whether tests pass.

Misses major architecture and business risks.

## 1 — Poor

Participant approves the PR because it compiles and tests are green.
