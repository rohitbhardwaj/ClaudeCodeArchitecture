# Debrief Script

## Opening

The original prompt was:

```text
Fix the bug in CheckoutService.java.
```

That prompt is not wrong because it is short.

It is wrong because it defines the problem boundary too narrowly.

## Key Message

In production systems, the bug may appear in one file but be caused by another boundary:

```text
controller mapping
validation
pricing
coupon rules
payment behavior
tests
API contracts
repository guidance
```

## What Changed?

When you upgraded the prompt, you moved from:

```text
code generation
```

to:

```text
system investigation
```

You also moved from:

```text
make a change
```

to:

```text
explain, assess, plan, and ask approval
```

## Architecture Point

This is how architects should use Claude Code:

```text
not as a faster patch generator,
but as a structured investigation partner.
```

## Closing Line

File-level prompts produce local fixes.

Architecture-level prompts protect system behavior.
