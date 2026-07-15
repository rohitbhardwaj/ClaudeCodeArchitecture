# Expected Findings

Participants should discover that the weak prompt is unsafe because it gives Claude Code too much freedom.

## Weak Prompt

```text
Improve this checkout code and make it production ready.
```

## What Is Missing?

### 1. No analyze-first instruction

Claude may immediately modify files instead of first understanding behavior.

### 2. No behavior preservation

The prompt does not say which API responses, error codes, validation rules, or side effects must remain unchanged.

### 3. No impacted-file list

Claude may touch controllers, clients, domain models, tests, configuration, or dependencies without first identifying blast radius.

### 4. No test protection

Claude may delete, rewrite, or weaken tests to fit the new implementation.

### 5. No architecture boundaries

Claude may move payment logic, inventory logic, cart logic, or order creation logic into the wrong layer.

### 6. No security requirements

Claude may accidentally log payment tokens, customer identifiers, request payloads, or other sensitive data.

### 7. No small-step plan

Claude may create one large PR that is difficult to review.

### 8. No approval gate

Claude may modify files before the architect has reviewed the plan.

## Strong Prompt Characteristics

A strong governed prompt uses phrases like:

- “Do not modify files yet.”
- “First summarize current behavior.”
- “List impacted files.”
- “Preserve public API behavior.”
- “Do not remove or weaken tests.”
- “Identify architecture and security risks.”
- “Propose a small-step plan.”
- “Wait for approval before modifying files.”
