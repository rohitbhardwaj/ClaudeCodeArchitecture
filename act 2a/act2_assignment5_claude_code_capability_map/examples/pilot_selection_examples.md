# Pilot Selection Examples

## Example 1 — Discovery Pilot

Use Claude Code to explain modules and map dependencies.

Why this is low risk:

```text
read-only
helps onboarding
improves architecture visibility
```

Guardrail:

```text
verify against code owners and tests
```

## Example 2 — Testing Pilot

Use Claude Code to suggest missing tests.

Why this is useful:

```text
improves safety net
finds edge cases
supports refactoring
```

Guardrail:

```text
human review of assertions
```

## Example 3 — Review Pilot

Use Claude Code to draft PR risk summaries.

Why this is useful:

```text
improves review focus
captures changed files
identifies missing tests
```

Guardrail:

```text
must not replace human review
must not invent test results
```

## Example 4 — Documentation Pilot

Use Claude Code to update README and ADR drafts.

Why this is useful:

```text
reduces stale docs
supports onboarding
```

Guardrail:

```text
review docs against code and tests
```
