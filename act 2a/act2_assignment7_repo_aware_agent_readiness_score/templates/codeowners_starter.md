# CODEOWNERS Starter

Use this as a starting point for Claude Code readiness.

```text
# Architecture-sensitive areas
/src/main/java/**/auth/**              @security-team @architecture-team
/src/main/java/**/authorization/**     @security-team @architecture-team

# Payment/pricing/tax/refund
/src/main/java/**/payment/**           @payments-team @architecture-team
/src/main/java/**/pricing/**           @finance-systems-team @architecture-team
/src/main/java/**/tax/**               @finance-systems-team @architecture-team
/src/main/java/**/refund/**            @payments-team @architecture-team

# API contracts
/openapi/**                            @api-governance-team @architecture-team
/proto/**                              @api-governance-team @architecture-team
/graphql/**                            @api-governance-team @architecture-team

# Database migrations
/src/main/resources/db/migration/**    @data-platform-team @architecture-team

# CI/CD
/.github/workflows/**                  @platform-team
/Jenkinsfile                           @platform-team

# Claude guidance
/CLAUDE.md                             @architecture-team
```
