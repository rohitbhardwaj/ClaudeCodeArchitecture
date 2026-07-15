# Prompt Review Rubric

Use this rubric to score the governed prompt.

Maximum score: **40 points**

| Category | Max Points | What Good Looks Like |
|---|---:|---|
| Analyze-first instruction | 5 | Prompt explicitly says not to modify files yet. |
| Behavior preservation | 5 | Prompt requires preserving public API behavior and error codes. |
| Architecture boundaries | 5 | Prompt names boundaries such as controller, service, payment, inventory, cart, and order creation. |
| Test protection | 5 | Prompt says not to remove or weaken tests and asks for test gaps. |
| Risk identification | 5 | Prompt asks for architecture, security, validation, rollback, and reviewability risks. |
| Small-step plan | 5 | Prompt asks for a small, reviewable plan before changes. |
| Approval gate | 5 | Prompt requires approval before modifying files. |
| Specificity | 5 | Prompt avoids slogans like “make clean” and gives concrete expectations. |

## Interpretation

| Score | Interpretation |
|---:|---|
| 35–40 | Strong governed prompt |
| 28–34 | Good prompt, but missing some controls |
| 20–27 | Partially governed, still risky |
| Below 20 | Mostly vibe prompting |

## Common Weaknesses

- Says “make it better” without defining better.
- Asks Claude to code immediately.
- Does not preserve public behavior.
- Does not protect tests.
- Does not ask for impacted files.
- Does not name security risks.
- Does not require human approval.
