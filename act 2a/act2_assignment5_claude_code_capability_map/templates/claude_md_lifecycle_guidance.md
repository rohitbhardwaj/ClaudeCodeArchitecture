# CLAUDE.md Lifecycle Guidance

Copy or adapt this into CLAUDE.md.

```markdown
## Claude Code Lifecycle Usage

### Discovery

Claude may explain code, map dependencies, and identify risks.
Claude must cite files and label uncertainty.

### Design

Claude may draft options, tradeoffs, and ADRs.
Architect approval is required before a design is treated as accepted.

### Coding

Claude may implement approved, focused changes.
Claude must keep changes small and preserve public behavior.

### Testing

Claude may draft tests and suggest edge cases.
Claude must not remove or weaken tests.

### Review

Claude may summarize PR changes and risks.
Claude must not approve, merge, or claim tests passed unless actually run.

### Documentation

Claude may draft README and ADR updates.
Documentation must be reviewed against code and tests.

### Modernization

Claude may analyze legacy code and propose migration steps.
Characterization tests are required before behavior-preserving refactors.

### Incident Response

Claude may analyze evidence and summarize hypotheses.
A human incident commander owns decisions, rollback, and production changes.
```
