# Claude Code Usage Levels

## Level 1 — Code Helper

Claude helps with a localized coding task.

Typical examples:

```text
write a utility function
explain a syntax issue
generate a small helper
format a block of code
draft a single test case
```

## Characteristics

```text
small scope
single file or function
limited blast radius
easy to review
low repository context needed
```

## Main Risk

The team may over-trust generated code because the task looks simple.

---

## Level 2 — Repo-Aware Assistant

Claude uses repository context to understand how code fits together.

Typical examples:

```text
explain service dependencies
generate tests based on existing behavior
analyze architecture drift
suggest migration steps for legacy code
identify affected files
map a module boundary
```

## Characteristics

```text
multi-file understanding
requires repository conventions
requires tests and architecture context
may reveal hidden coupling
requires stronger review
```

## Main Risk

Claude may infer architecture from messy or outdated code unless repository guidance is clear.

---

## Level 3 — Engineering Workflow Agent

Claude participates in delivery workflow activities.

Typical examples:

```text
create a PR summary
run test commands and interpret failures
update docs after code changes
propose quality gates
summarize incident evidence
draft release notes
prepare migration playbooks
```

## Characteristics

```text
touches engineering process
may influence review and release decisions
requires workflow guardrails
requires human accountability
```

## Main Risk

The team may allow Claude to influence engineering decisions without explicit quality gates.

---

## Summary

```text
Level 1 asks: Can Claude help write code?
Level 2 asks: Can Claude understand the repo?
Level 3 asks: Can Claude participate in the engineering system?
```
