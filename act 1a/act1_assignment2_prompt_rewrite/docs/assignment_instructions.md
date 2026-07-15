# Assignment Instructions

## Assignment 2 — Before/After Prompt Rewrite

## Situation

You are the architect for a team that owns a legacy checkout module.

A developer wants to use Claude Code with this prompt:

```text
Improve this checkout code and make it production ready.
```

The developer believes this is safe because Claude Code can inspect the repository, edit code, add tests, and summarize changes.

Your job is to rewrite the prompt so Claude Code operates within architecture boundaries.

---

## Step 1 — Inspect the Legacy Module

Open:

```text
src/main/java/com/acme/checkout/LegacyCheckoutService.java
```

Look for:

- Mixed responsibilities
- API behavior
- Payment boundary
- Inventory boundary
- Cart boundary
- Order creation boundary
- Validation rules
- Logging risks
- Test coverage expectations
- Public behavior that must not change

---

## Step 2 — Analyze the Weak Prompt

Weak prompt:

```text
Improve this checkout code and make it production ready.
```

Ask:

1. What does “improve” mean?
2. What does “production ready” mean?
3. What behavior must not change?
4. What boundaries must Claude preserve?
5. What tests must not be removed or weakened?
6. What risky actions require approval?

---

## Step 3 — Write a Governed Prompt

Your rewritten prompt must include:

- Analyze first, do not code yet.
- Summarize current behavior.
- Identify impacted files.
- Preserve public API behavior.
- Do not remove or weaken tests.
- Identify architecture risks.
- Propose a small-step plan.
- Ask for approval before modifying files.

---

## Step 4 — Review Your Prompt

Use the rubric in:

```text
rubrics/prompt_review_rubric.md
```

Score your governed prompt.

---

## Step 5 — Reflection

Answer:

> What part of the original prompt gave Claude too much freedom?

Then write one repository rule that should be added to `CLAUDE.md`.
