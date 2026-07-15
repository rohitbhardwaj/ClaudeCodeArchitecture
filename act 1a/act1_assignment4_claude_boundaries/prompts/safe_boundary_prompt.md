# Safe Boundary Prompt

Use this prompt when starting a risky task.

```text
Before making any changes, classify this task into one of three categories:

1. Claude may do
2. Claude must ask first
3. Claude must never do

Then explain:
- Why you chose that category.
- What files may be impacted.
- What behavior could change.
- What tests would be needed.
- What human approvals are required.

Do not modify files until approval is given.
```
