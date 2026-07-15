# RACI Template for Claude Code Usage

RACI:

```text
R = Responsible
A = Accountable
C = Consulted
I = Informed
```

| Activity | Claude Code | Developer | Architect | Security | Product | Ops |
|---|---|---|---|---|---|---|
| Explain code | R | A | C | I | I | I |
| Generate tests | R | A | C | I | I | I |
| Draft ADR | R | R | A | C | C | C |
| API contract change | C | R | A | C | C | I |
| Payment behavior change | C | R | A | C | C | I |
| Merge PR | I | R | A/C | C | I | I |
| Production release | I | R | C | C | C | A |
| Rollback decision | C | R | C | C | C | A |

## Teaching Point

Claude can be responsible for drafting or analysis, but a human remains accountable for decisions.
