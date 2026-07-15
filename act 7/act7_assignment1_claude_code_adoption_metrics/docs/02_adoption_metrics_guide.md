# Claude Code Adoption Metrics Guide

## Why Usage Metrics Are Not Enough

Counting Claude Code usage only tells you adoption volume.

It does not tell you whether engineering outcomes improved.

Weak metrics:

```text
number of prompts
number of generated lines
number of Claude-assisted PRs
number of developers using Claude
```

These may be useful context, but they are not success by themselves.

## Better Metrics

Measure whether Claude Code improves:

```text
delivery speed
PR quality
reviewability
test quality
defect rate
security posture
rollback safety
developer experience
```

## Success Metrics vs Guardrail Metrics

### Success Metrics

Show whether Claude Code is helping.

Examples:

```text
cycle time decreased
smaller PRs
less repetitive work
better documentation
more meaningful tests
```

### Guardrail Metrics

Show whether Claude Code is creating new risk.

Examples:

```text
more defects
more security findings
more rollbacks
large AI-generated diffs
happy-path-only tests
architecture review comments increasing
```

## Core Rule

```text
Speed is only good if quality, safety, and reviewability hold.
```
