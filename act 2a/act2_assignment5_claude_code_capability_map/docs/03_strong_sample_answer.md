# Strong Sample Answer

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

## Why This Is Strong

The answer does not treat Claude Code as a generic coding tool.

It places Claude Code intentionally across the lifecycle and pairs every capability with:

```text
risk
guardrail
human accountability
```

## Key Insight

Claude Code creates value across the lifecycle, but each stage needs different controls.
