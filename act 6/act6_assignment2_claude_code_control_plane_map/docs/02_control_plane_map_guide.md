# Claude Code Control Plane Map Guide

## What Is the Control Plane?

The Claude Code control plane is the set of artifacts that shape, constrain, verify, and review Claude-assisted work.

It includes:

```text
repo rules
architecture docs
approval ownership
PR evidence
test requirements
API contracts
dependency controls
security policies
rollback runbooks
CI gates
```

## Why It Matters

If governance only lives in meeting notes or slide decks, Claude will not see it.

If developers cannot find it during work, they will not follow it.

Strong governance lives in repository and operating artifacts.

## Design Principle

```text
Put controls where work happens.
```

## Control Categories

### Guidance Controls

Tell Claude and developers what to do.

Examples:

```text
CLAUDE.md
architecture docs
runbooks
policies
```

### Ownership Controls

Define who must approve.

Examples:

```text
CODEOWNERS
approval matrix
```

### Evidence Controls

Make work visible in PRs.

Examples:

```text
PR template
review checklist
rollback section
```

### Verification Controls

Automate checks.

Examples:

```text
CI
contract tests
unit tests
dependency scans
PII scans
```
