# Architect Review Sheet

Use this table while reviewing the simulated Claude-generated PR.

| Category | What to Inspect | What Did You Find? |
|---|---|---|
| Behavior | Did public error codes change? |  |
| Behavior | Did validation behavior change? |  |
| Architecture | Did boundaries improve or drift? |  |
| Architecture | Was a new helper added correctly? |  |
| Testing | Were deleted tests important? |  |
| Testing | Did tests protect old behavior or match new behavior? |  |
| Security | Was authentication preserved? |  |
| Security | Were secrets or payment tokens logged? |  |
| Maintainability | Is the code clearer without changing behavior? |  |
| Reviewability | Is too much mixed into one PR? |  |

## Final PR Decision

Choose one:

```text
A. Approve
B. Request changes
C. Split into smaller PRs
D. Reject and restart with a plan-first prompt
```

## Required Written Output

Participants should produce:

```text
1. Top three risks:
2. Tests that were weakened or removed:
3. Public behavior that changed:
4. Security concerns:
5. Recommended PR decision:
6. One missing prompt constraint:
7. One CLAUDE.md rule to add:
```
