# Debrief Script

## Opening

This exercise is about authority.

Not every Claude Code task should have the same permission level.

## Key Contrast

```text
Explain how checkout works
```

is very different from:

```text
Modify payment retry logic
```

And:

```text
Generate missing unit tests
```

is very different from:

```text
Delete failing tests
```

## Main Lesson

Claude Code must operate inside a task boundary model.

The boundary model should answer:

```text
What is safe now?
What requires approval?
What is not allowed?
```

## Governance Message

The risk is not only what Claude can generate.

The risk is what authority the team gives it.

## Closing Line

Different engineering actions require different authority.
Claude Code should not have one permission level.
