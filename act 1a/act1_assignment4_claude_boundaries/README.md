# Act 1 Assignment 4 — What Should Claude Not Do?

## Theme

Governance starts by defining what the agent is allowed to do, what requires approval, and what is forbidden.

## Scenario

Your organization wants to let developers use Claude Code in production repositories.

The question is not only:

```text
What can Claude Code do?
```

The better architecture question is:

```text
What should Claude Code be allowed to do without approval?
What should require human approval?
What should be forbidden?
```

## Architect Task

Participants define Claude Code boundaries using a three-column control model:

| Claude may do | Claude must ask first | Claude must never do |
|---|---|---|
| Explain code | Modify auth logic | Expose secrets |
| Generate tests | Change payment behavior | Delete tests silently |
| Draft docs | Change public APIs | Log PII |
| Suggest refactors | Add dependencies | Rewrite large modules without approval |
| Analyze risks | Modify data migrations | Bypass review |

## Discussion Prompt

```text
Which “must ask first” rule would prevent the most damage in your organization?
```

## What Is Included

This kit includes:

- Assignment instructions
- Participant worksheet
- Boundary decision matrix
- Facilitator guide
- Scoring rubric
- Example completed answer
- Governance policy template
- Claude boundary rules for CLAUDE.md
- Risk cards for team discussion
- Debrief script
- Prompt examples
- Permission and review gate examples

## Recommended Duration

25–35 minutes as a workshop exercise.
10–12 minutes as a compressed conference exercise.
