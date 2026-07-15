# CLAUDE.md Starter — Repo-Aware Agent Guidance

Copy or adapt this into a repository-level CLAUDE.md file.

```markdown
## Claude Code Usage Levels

### Level 1 — Code Helper

Claude may help with localized, low-risk tasks:
- explain a function
- draft a utility method
- generate small test examples
- clarify syntax or framework usage

### Level 2 — Repo-Aware Assistant

For repo-aware tasks, Claude must analyze before changing code:
- explain dependencies
- map modules
- generate characterization test plans
- analyze architecture drift
- suggest migration steps

Before changes, Claude must produce:
1. Current behavior.
2. Related files.
3. Tests that cover the behavior.
4. Risks.
5. Proposed small-step plan.

### Level 3 — Engineering Workflow Agent

For workflow-level tasks, Claude must not bypass human review:
- PR summaries
- test interpretation
- documentation updates
- quality gate proposals
- migration playbooks

Claude must not:
- merge PRs without approval
- bypass review
- claim tests passed unless run
- hide failures
- weaken tests
- change public behavior without approval
```
