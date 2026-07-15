# Expected Findings from Source Repo

Participants should inspect the included source repo and identify where authority boundaries belong.

## Key Files

```text
CLAUDE.md — Safe / Ask / Never rules visible to Claude
CODEOWNERS — approval owners
docs/policies/safe-ask-never-policy.md — formal policy
docs/security/pii-logging-policy.md — PII rules
api/openapi.yaml — API contract protection
pom.xml — dependency review trigger
.github/pull_request_template/pull_request_template.md — PR disclosure and approval evidence
.github/workflows/ci.yml — CI/security enforcement
```

## Key Teaching Point

The policy should not live only in a slide deck.

It must live in the repo where Claude and developers can see it.
