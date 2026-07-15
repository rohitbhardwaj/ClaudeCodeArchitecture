# Debrief Script

Use this after participants complete Assignment 2.

---

## Opening Debrief

The original prompt sounded reasonable:

```text
Improve this checkout code and make it production ready.
```

But this is exactly where vibe coding risk starts.

The phrase “improve” gives Claude Code design authority without defining the design goal.

The phrase “production ready” gives Claude Code quality authority without defining the quality gates.

---

## Key Teaching Point

A governed prompt does not simply ask for output.

A governed prompt asks Claude Code to:

1. Understand the current system.
2. Preserve the current contract.
3. Identify risks.
4. Propose a plan.
5. Wait for human approval.

---

## Strong Debrief Line

> Vibe prompting says: “Go make this better.”  
> Governed prompting says: “Analyze the system, preserve behavior, expose risk, propose a plan, and wait for approval.”

---

## Architecture Lesson

The architect’s job is not to block Claude Code.

The architect’s job is to define safe delegation.

Claude Code can accelerate discovery, refactoring, testing, and documentation, but only if the team gives it explicit boundaries.

---

## Closing Reflection

Ask the room:

> What part of your current engineering process still depends on tribal knowledge that Claude Code cannot see?

Then close with:

> If it matters repeatedly in review, it belongs in CLAUDE.md, tests, quality gates, or team workflow.
