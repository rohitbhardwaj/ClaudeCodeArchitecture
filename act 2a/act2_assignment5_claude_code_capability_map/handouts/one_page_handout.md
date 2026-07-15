# One-Page Handout — Claude Code Capability Map

## Capability Map

| Delivery stage | Claude Code can help with | Risks | Guardrail needed |
|---|---|---|---|
| Discovery | Explain code, map dependencies | Misread outdated code | Verify against tests and owners |
| Design | Draft options, tradeoffs, ADRs | Premature abstraction | Architect approval |
| Coding | Generate focused changes | Over-generation | Small PRs |
| Testing | Generate unit and edge tests | Weak assertions | Human review |
| Review | Summarize PR risks | Miss hidden behavior | Quality checklist |
| Documentation | Update README/ADR | Docs may become false | Review against code |
| Modernization | Analyze legacy modules | Unsafe rewrite | Characterization tests |
| Incident response | Analyze diffs/logs/tests | Wrong root cause | Human incident commander |

## Reflection

```text
Which delivery stage gives your team the highest value with the lowest risk?
```

## Key Lesson

```text
Claude Code is most valuable when placed intentionally into the delivery lifecycle,
not randomly invoked during coding.
```
