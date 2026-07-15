# One-Page Handout — Act 1 Personal Reflection

## The Question

```text
Where is my team already doing vibe coding?
```

## Five Reflection Prompts

```text
1. Where are we already doing vibe coding?
2. Which tasks are safe for Claude Code today?
3. Which tasks require architect approval?
4. Which repeated review comment should become written guidance?
5. What is one rule we should add to CLAUDE.md?
```

## Safe Claude Code Tasks

```text
explain code
summarize modules
draft documentation
generate draft tests
identify risks
suggest refactoring options
```

## Architect Approval Required

```text
auth
payments
pricing
tax
refunds
public APIs
database migrations
large refactors
CI/CD
production configuration
```

## Must Not Do

```text
expose secrets
log PII
delete tests silently
weaken assertions
bypass review
commit directly to main
disable quality gates
```

## Closeout Question

```text
What is one architecture rule that currently lives in people’s heads but should live in the repo?
```

## Final Reminder

```text
If a rule matters repeatedly, make it visible in CLAUDE.md, tests, review gates, or CI/CD.
```
