# Repo Readiness Assessment Prompt

Use this prompt to have Claude assist with a readiness assessment.

```text
Assess this repository for Claude Code readiness.

Do not modify files.

Score each dimension from 1 to 5:
1. Clear repository structure
2. Good README
3. Strong CLAUDE.md
4. Existing tests
5. API contracts documented
6. Architecture boundaries clear
7. Security rules documented
8. Logging/PII rules documented
9. CI/CD quality gates
10. CODEOWNERS/review ownership
11. Rollback patterns
12. ADRs or design docs

For each dimension provide:
- score
- evidence found
- gap
- recommended improvement

Then provide:
- total score
- recommended usage level
- top 3 improvements
- first 30-day action plan

Do not assume missing evidence exists. If something is not found, say so.
```
