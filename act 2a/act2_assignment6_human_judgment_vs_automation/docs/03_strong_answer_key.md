# Strong Answer Key

| Responsibility | Best classification |
|---|---|
| Explain code | Claude can automate |
| Choose architecture style | Human must decide |
| Generate unit tests | Shared |
| Approve API contract change | Human must decide |
| Suggest refactor plan | Claude can automate |
| Decide payment behavior | Human must decide |
| Draft ADR | Shared |
| Merge PR | Human must decide |
| Identify security risks | Shared |
| Approve production release | Human must decide |
| Summarize incident evidence | Claude can automate |
| Decide rollback | Human must decide |

## Explanation

### Explain code

Claude can automate because it is read-only and assistive. Humans should still verify important claims.

### Choose architecture style

Human must decide because architecture style reflects long-term tradeoffs, team skills, operational constraints, and business context.

### Generate unit tests

Shared because Claude can draft tests, but humans must verify assertions and behavior.

### Approve API contract change

Human must decide because clients, partners, support, and monitoring may depend on the contract.

### Suggest refactor plan

Claude can automate the proposal, but implementation still requires approval if risky.

### Decide payment behavior

Human must decide because payment changes affect money movement, customer trust, fraud, and reconciliation.

### Draft ADR

Shared because Claude can draft, but the decision must be reviewed and owned by humans.

### Merge PR

Human must decide because merge is a governance and accountability action.

### Identify security risks

Shared because Claude can help identify risks, but security review requires human judgment.

### Approve production release

Human must decide because release approval is an accountability boundary.

### Summarize incident evidence

Claude can automate because it organizes evidence, but should not decide root cause alone.

### Decide rollback

Human must decide because rollback involves production risk, customer impact, and business tradeoffs.
