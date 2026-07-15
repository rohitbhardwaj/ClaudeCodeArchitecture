# Scoring and Interpretation Guide

## Scoring

Each dimension receives a score from 1 to 5.

```text
1 = not ready
2 = risky
3 = usable with caution
4 = ready for controlled use
5 = strong governed engineering environment
```

## Total Score

There are 12 dimensions.

Minimum score:

```text
12
```

Maximum score:

```text
60
```

## Interpretation

### 12–25: Do Not Scale Claude Code Yet

Use Claude only for:

```text
read-only explanation
draft documentation
local experiments outside production repos
```

Main need:

```text
repository hygiene and basic documentation
```

### 26–40: Read-Only and Draft Usage

Use Claude for:

```text
code explanation
dependency mapping
draft docs
test suggestions
risk summaries
```

Avoid:

```text
production code changes
large refactors
workflow automation
```

### 41–50: Small Changes With Review

Use Claude for:

```text
small approved changes
test generation
PR summaries
focused refactors
documentation updates
```

Required:

```text
human review
tests
CLAUDE.md
approval boundaries
```

### 51–60: Controlled Team Adoption

Use Claude across the lifecycle with controls:

```text
discovery
design drafts
coding with approval
testing
review support
documentation
modernization planning
incident evidence analysis
```

Required:

```text
quality gates
CODEOWNERS
security rules
rollback patterns
decision boundaries
```

## Important Note

A high score does not mean Claude can act without review.

It means the repository is mature enough for governed usage.
