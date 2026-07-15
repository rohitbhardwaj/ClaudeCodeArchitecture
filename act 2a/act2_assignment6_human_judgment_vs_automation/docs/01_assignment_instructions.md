# Assignment Instructions

## Scenario

Your organization is deciding what Claude Code should automate and what humans must still decide.

Claude Code is powerful, but not every responsibility should be delegated.

## Architect Task

Classify each responsibility into one of three categories:

```text
Claude can automate
Human must decide
Shared
```

## Categories

### Claude can automate

Claude can perform the task with normal review because the responsibility is low-risk, analytical, or assistive.

Examples:

```text
explain code
summarize incident evidence
suggest refactor plan
```

### Human must decide

A human must own the final decision because the responsibility involves accountability, business risk, security, architecture, production impact, or governance.

Examples:

```text
choose architecture style
approve API contract change
merge PR
approve production release
decide rollback
```

### Shared

Claude can assist, draft, analyze, or suggest, but a human must review and approve.

Examples:

```text
generate unit tests
draft ADR
identify security risks
```

## Reflection Question

```text
What decision are you currently allowing tools to influence too much?
```

## Output

Complete the worksheet in:

```text
worksheets/participant_judgment_vs_automation_worksheet.md
```
