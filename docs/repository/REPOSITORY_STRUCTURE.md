# Recommended Repository Structure

Use this structure for the GitHub repository.

```text
claude-code-architecture/
├── README.md
├── docs/
│   ├── executive/
│   ├── facilitator/
│   ├── participant/
│   ├── repository/
│   ├── governance/
│   └── templates/
├── slides/
│   ├── act-01/
│   ├── act-02/
│   ├── act-03/
│   ├── act-04/
│   ├── act-05/
│   ├── act-06/
│   ├── act-07/
│   ├── act-08/
│   └── act-09/
├── assignments/
│   ├── act-01/
│   ├── act-02/
│   ├── act-03/
│   ├── act-04/
│   ├── act-05/
│   ├── act-06/
│   ├── act-07/
│   └── act-08/
├── source-simulations/
│   ├── plan-before-code/
│   ├── blast-radius/
│   ├── safe-ask-never/
│   ├── control-plane-map/
│   ├── rollout-readiness/
│   ├── adoption-metrics/
│   ├── continuous-improvement-loop/
│   ├── production-change-readiness/
│   └── architecture-review-board/
├── templates/
│   ├── CLAUDE.md
│   ├── PULL_REQUEST_TEMPLATE.md
│   ├── safe-ask-never-policy.md
│   ├── arch-gate-review-checklist.md
│   ├── rollout-readiness-scorecard.md
│   └── monthly-learning-loop.md
├── .github/
│   ├── ISSUE_TEMPLATE.md
│   └── pull_request_template.md
├── CONTRIBUTING.md
└── LICENSE
```

## Repository Principles

```text
Keep slides separate from exercises.
Keep source simulations runnable or at least inspectable.
Keep templates reusable.
Keep governance docs easy to copy into production repositories.
```
