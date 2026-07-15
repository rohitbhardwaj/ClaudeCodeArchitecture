# Scoring Rubric — Prompt Upgrade

## 5 — Excellent

Prompt includes:

```text
analyze first
do not modify files
related files
current behavior
possible root causes
tests
missing tests
security/API risks
small-step plan
rollback risk
approval before coding
clear constraints
```

## 4 — Strong

Prompt includes most required elements and strong constraints, but may miss rollback or one related file type.

## 3 — Acceptable

Prompt asks for analysis and related files but has weak constraints or approval boundary.

## 2 — Weak

Prompt is longer than the original but still focuses mainly on fixing one file.

## 1 — Poor

Prompt asks Claude to directly edit code without investigation or approval.
