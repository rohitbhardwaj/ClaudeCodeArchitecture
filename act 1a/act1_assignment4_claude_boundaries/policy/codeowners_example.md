# CODEOWNERS Example for Claude Code Governance

This is an example of how repository review ownership can support Claude Code boundaries.

```text
# Authentication and authorization require security + architecture approval
/src/main/java/**/auth/**          @security-team @architecture-team
/src/main/java/**/authorization/** @security-team @architecture-team

# Payment, pricing, billing, tax, and refunds require finance + architecture approval
/src/main/java/**/payment/**       @payments-team @architecture-team
/src/main/java/**/pricing/**       @finance-systems-team @architecture-team
/src/main/java/**/tax/**           @finance-systems-team @architecture-team
/src/main/java/**/refund/**        @payments-team @architecture-team

# Database migrations require data/platform approval
/src/main/resources/db/migration/** @data-platform-team @architecture-team

# CI/CD requires platform approval
/.github/workflows/**              @platform-team
/Jenkinsfile                       @platform-team

# Public API contracts require API governance approval
/openapi/**                        @api-governance-team @architecture-team
/proto/**                          @api-governance-team @architecture-team
```

## Teaching Point

Claude Code boundaries should not live only in prompts.

They should be reinforced through repository controls.
