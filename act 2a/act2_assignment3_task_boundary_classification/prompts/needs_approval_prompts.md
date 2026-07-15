# Needs-Approval Prompt Examples

## Public API Change

```text
Analyze the proposed public API error-code change.

Do not modify files yet.

First produce:
1. Current error codes.
2. Clients that may depend on them.
3. Monitoring and support impact.
4. Backward compatibility risks.
5. Migration options.
6. Tests required.
7. Approval needed.

Wait for approval before modifying files.
```

## Dependency Addition

```text
Evaluate whether adding this dependency is justified.

Do not modify package files.

Analyze:
1. Why it is needed.
2. Existing alternatives in the repo.
3. Security vulnerabilities.
4. License impact.
5. Maintenance risk.
6. Bundle/runtime impact.
7. Approval needed.

Wait for approval before adding the dependency.
```

## Payment Retry Change

```text
Analyze the payment retry behavior change.

Do not modify files yet.

Produce:
1. Current retry behavior.
2. Customer charge risk.
3. Idempotency risk.
4. Fraud/reconciliation impact.
5. Tests required.
6. Rollback plan.
7. Approvals needed.

Wait for approval before coding.
```
