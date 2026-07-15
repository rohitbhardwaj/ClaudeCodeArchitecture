# CLAUDE.md Decision Boundary Guidance

Copy or adapt into CLAUDE.md.

```markdown
## Human Judgment and Decision Boundaries

Claude may automate:
- explaining code
- summarizing evidence
- suggesting refactor plans
- drafting PR summaries
- organizing incident evidence

Claude may assist, but humans must validate:
- unit tests
- ADR drafts
- security risk identification
- architecture tradeoff analysis
- incident hypotheses

Humans must decide:
- architecture style
- API contract changes
- payment, pricing, tax, or refund behavior
- authentication or authorization behavior
- production release approval
- rollback decisions
- PR merge approval
- governance exceptions

Claude must not present recommendations as final decisions.

For human-owned decisions, Claude must:
1. Present options.
2. List tradeoffs.
3. Identify risks.
4. State assumptions.
5. List required approvals.
6. Wait for human decision.
```
