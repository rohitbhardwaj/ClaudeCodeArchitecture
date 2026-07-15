# Example Completed Capability Map

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

## Reflection Answer

```text
Discovery gives our team the highest value with the lowest risk because Claude can explain unfamiliar code and map dependencies without changing production code.
```

## Pilot Recommendation

```text
Start with discovery and PR review summaries before expanding into coding.
```

## First Guardrail

```text
Claude must cite files and tests when explaining repository behavior.
```
