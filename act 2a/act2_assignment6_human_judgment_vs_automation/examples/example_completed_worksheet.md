# Example Completed Worksheet

| Responsibility | Best classification | Why |
|---|---|---|
| Explain code | Claude can automate | Read-only explanation. |
| Choose architecture style | Human must decide | Requires tradeoffs, context, and accountability. |
| Generate unit tests | Shared | Claude drafts; humans validate assertions. |
| Approve API contract change | Human must decide | Public commitment affecting clients. |
| Suggest refactor plan | Claude can automate | Proposal only; implementation may need approval. |
| Decide payment behavior | Human must decide | Affects money movement and trust. |
| Draft ADR | Shared | Claude drafts; humans own decision. |
| Merge PR | Human must decide | Governance and accountability boundary. |
| Identify security risks | Shared | Claude helps; security experts validate. |
| Approve production release | Human must decide | Production accountability. |
| Summarize incident evidence | Claude can automate | Evidence organization, not final judgment. |
| Decide rollback | Human must decide | Production and business tradeoff. |

## Example Reflection

```text
We may be allowing tools to influence architecture style too much when we accept generated designs without validating operational constraints, team skills, and long-term maintainability.
```

## Example CLAUDE.md Rule

```markdown
Claude may recommend architecture options, but must not present an architecture decision as final. Architecture style, API contract changes, payment behavior, production releases, merges, and rollbacks require explicit human approval.
```
