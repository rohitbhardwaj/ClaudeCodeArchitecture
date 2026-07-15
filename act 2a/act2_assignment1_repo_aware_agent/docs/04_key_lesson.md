# Key Lesson

## The Shift

Most teams begin with Claude Code at Level 1:

```text
Write this function.
Fix this bug.
Add tests.
Clean this file.
```

But the real power begins at Level 2 and Level 3:

```text
Explain the module.
Map dependencies.
Identify test gaps.
Analyze architecture drift.
Summarize PR risk.
Update documentation.
Interpret test failures.
Propose quality gates.
```

## The Risk

As Claude becomes more repo-aware, the blast radius increases.

A local code suggestion may affect one function.

A repo-aware agent may affect:

```text
architecture boundaries
test strategy
API contracts
security behavior
team review workflow
release confidence
documentation accuracy
```

## The Governance Principle

```text
The more repo-aware Claude becomes,
the more architecture-aware your controls must become.
```

## What Architects Should Do

Architects should define:

```text
what Claude may inspect
what Claude may modify
what Claude must ask before changing
what quality gates are required
what human decisions remain non-delegable
```
