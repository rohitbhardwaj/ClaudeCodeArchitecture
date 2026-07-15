# Facilitator Guide

## Purpose

This assignment helps architects experience the difference between a vague AI coding prompt and a governed engineering prompt.

## Setup

Tell participants:

> You are reviewing a developer’s intent before Claude Code touches the repository. Your job is not to write code. Your job is to design the delegation boundary.

## Recommended Timing

| Segment | Time |
|---|---:|
| Set context | 2 min |
| Read weak prompt | 1 min |
| Inspect code | 5 min |
| Identify missing controls | 5 min |
| Write governed prompt | 8 min |
| Compare sample answer | 5 min |
| Reflection | 4 min |

## Facilitation Notes

### What to emphasize

- “Improve” is not an engineering requirement.
- “Production ready” is not a testable instruction unless the team defines it.
- Claude Code needs constraints before it needs freedom.
- Architects should preserve behavior before refactoring.
- A prompt can become an architecture control surface.

### Good discussion questions

1. What should Claude inspect before coding?
2. Which behavior must not change?
3. Which files should be considered high risk?
4. Which tests protect the business contract?
5. What should require human approval?

## Expected Outcome

Participants should produce a prompt that requires Claude Code to:

- Analyze before coding
- Summarize current behavior
- Identify impacted files
- Preserve public API behavior
- Preserve tests
- Identify risks
- Propose a plan
- Wait for approval

## Closing Line

> The prompt is not just a request. In AI-assisted engineering, the prompt is part of the architecture control plane.
