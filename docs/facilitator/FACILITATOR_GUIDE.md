# Facilitator Guide

## Purpose

This guide helps you deliver the talk as either a 90-minute conference session or a hands-on architecture workshop.

## Facilitation Style

Use the session as a practical architecture conversation, not a product demo.

The goal is to help participants build judgment.

## Recommended Pattern for Each Act

```text
1. Introduce the core idea.
2. Show the risk.
3. Introduce the governance pattern.
4. Run a short assignment or scenario.
5. Debrief with a strong sample answer.
```

## What to Emphasize

```text
Claude Code is powerful, but not autonomous architecture authority.
Repo context matters.
Prompting alone is not enough.
Review discipline matters more when generation is faster.
Production safety requires rollback, tests, ownership, and evidence.
```

## Common Participant Reactions

### “This slows us down.”

Response:

```text
The goal is not slower delivery. The goal is safe acceleration. A bad AI-generated PR can cost more than the time saved.
```

### “Developers already know how to review code.”

Response:

```text
AI-assisted diffs require the same review discipline plus more attention to scope, hidden coupling, tests, disclosure, and rollback.
```

### “Can’t we just trust Claude?”

Response:

```text
Claude can help reason and implement, but production ownership still belongs to the engineering team.
```

## Debrief Questions

```text
What would you allow Claude to do immediately?
What would require approval?
What should Claude never do silently?
Which repo artifact would encode this rule?
Which CI gate would enforce it?
What would you measure next month?
```

## Strong Closing

```text
Plan before change.
Constrain before generate.
Test before trust.
Review before merge.
Govern before scale.
```
