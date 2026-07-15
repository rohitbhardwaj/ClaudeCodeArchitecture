# Original Prompt and Missing Constraints

## Original Prompt

```text
Improve checkout discount handling and clean up pricing logic.
Make the code more production ready.
Update tests.
```

## Why It Was Unsafe

The prompt did not say:

```text
Analyze first.
Do not code yet.
Preserve current coupon behavior.
Preserve case-insensitive matching.
Preserve campaign fallback.
Preserve support reason codes.
Do not log customer email or PII.
Do not remove or weaken tests.
Identify impacted files.
List risks.
Ask for approval before changing validation behavior.
```

## Better Prompt Principle

For production behavior:

```text
Analyze first.
Constrain before change.
Preserve behavior unless approved.
Ask before risky modifications.
```
