# Claude Code Governance Model

## Purpose

This model defines how teams can use Claude Code safely across production repositories.

## Governance Layers

## 1. Guidance Layer

```text
CLAUDE.md
architecture docs
prompt templates
runbooks
```

Purpose:

```text
Tell Claude and developers how to work in this repository.
```

## 2. Authority Layer

```text
Safe / Ask / Never policy
CODEOWNERS
approval matrix
```

Purpose:

```text
Define what Claude may do, what requires approval, and who owns decisions.
```

## 3. Evidence Layer

```text
PR template
Claude disclosure
test evidence
risk section
rollback section
```

Purpose:

```text
Make AI-assisted work reviewable.
```

## 4. Verification Layer

```text
unit tests
contract tests
security scans
dependency scans
CI gates
```

Purpose:

```text
Automate checks where possible.
```

## 5. Learning Layer

```text
monthly review
metrics dashboard
feedback loop
new katas
updated templates
```

Purpose:

```text
Improve governance based on real usage.
```

## Core Principle

```text
Governed Claude Code is not one control. It is a system of rules, ownership, evidence, verification, and learning.
```
