# Debrief Script

Use this after the pair discussion.

## Opening

Most teams already have architecture rules.

The problem is that many of those rules are invisible.

They live in:

```text
senior engineers' memories
PR comments
incident history
Slack messages
architecture review meetings
```

## Key Point

Claude Code cannot reliably honor rules that the repository does not expose.

If a rule matters, make it visible.

## Examples

```text
If public API error codes must not change, write that down.
If payment logic requires approval, write that down.
If tests must not be weakened, write that down.
If customer identifiers must not be logged, write that down.
If legacy refactors require characterization tests, write that down.
```

## Governance Message

This is not about slowing developers down.

This is about preventing the same correction from being made repeatedly in every pull request.

## Closing Line

Architecture becomes scalable when judgment moves from people’s heads into shared guidance, tests, and gates.
