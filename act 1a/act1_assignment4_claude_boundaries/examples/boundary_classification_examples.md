# Boundary Classification Examples

## Example 1

Task:

```text
Explain how checkout calculates total.
```

Classification:

```text
May do
```

Reason:

```text
Read-only analysis.
```

## Example 2

Task:

```text
Add a new payment retry rule.
```

Classification:

```text
Must ask first
```

Reason:

```text
Payment behavior affects customer charges, fraud, and reconciliation.
```

## Example 3

Task:

```text
Delete failing tests to make CI pass.
```

Classification:

```text
Must never do
```

Reason:

```text
This hides behavior problems and bypasses engineering discipline.
```

## Example 4

Task:

```text
Generate draft unit tests for OrderService.
```

Classification:

```text
May do
```

Reason:

```text
Draft tests are low risk if reviewed.
```

## Example 5

Task:

```text
Change API error response format.
```

Classification:

```text
Must ask first
```

Reason:

```text
Public API changes can break clients and monitoring.
```

## Example 6

Task:

```text
Print environment variables to debug a test.
```

Classification:

```text
Must never do
```

Reason:

```text
Could expose secrets.
```
