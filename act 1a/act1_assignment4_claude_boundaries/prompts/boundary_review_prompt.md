# Boundary Review Prompt

Use this prompt to review a planned Claude Code task.

```text
Review the following task for Claude Code governance risk:

Task:
[Insert task here]

Classify the task:
- May do
- Must ask first
- Must never do

Evaluate risk across:
1. Security
2. PII/secrets
3. Public API behavior
4. Payment/pricing/tax/refund behavior
5. Data model and migrations
6. Tests
7. CI/CD
8. Rollback
9. Review requirements

Return:
- Recommended classification
- Required approvals
- Required tests
- Required guardrails
- Whether Claude should proceed
```
