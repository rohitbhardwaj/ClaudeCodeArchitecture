# Act 1 Assignment Simulation Kit

## The Vibe Coding Incident: OrderService

This package supports Act 1 of the talk **Claude Code Architecture: From Vibe Coding to Governed Engineering Systems**.

The simulation helps architects and senior developers experience a realistic AI-generated refactor that looks clean, compiles, and has green tests, but introduces hidden architecture, security, behavior, and testing risks.

## Learning Goal

Participants should understand this lesson:

> Green tests are not enough. Architecture review must verify behavior, boundaries, security, reviewability, and maintainability.

## Files Included

```text
act1_vibe_coding_simulation/
├── README.md
├── docs/
│   ├── 01_assignment_instructions.md
│   ├── 02_architect_review_sheet.md
│   ├── 03_expected_findings.md
│   ├── 04_debrief_script.md
│   └── 05_restart_prompt.md
├── facilitator/
│   └── facilitator_guide.md
├── src/main/java/com/acme/orders/original/
│   └── OriginalOrderServiceSimulation.java
├── src/main/java/com/acme/orders/refactored/
│   └── ClaudeGeneratedRefactorSimulation.java
├── src/test/java/com/acme/orders/original/
│   └── OriginalOrderServiceTest.java
└── src/test/java/com/acme/orders/refactored/
    └── ClaudeGeneratedOrderServiceTest.java
```

## How to Use in Class

1. Give participants the original class first.
2. Then show the Claude-generated refactor.
3. Tell them: **all tests are green**.
4. Ask them to review it as if it is going to production today.
5. Use the review sheet to guide their findings.
6. Debrief using the facilitator guide.

## Recommended Decision

The recommended architect decision is:

```text
D. Reject and restart with a plan-first prompt
```

A softer answer is:

```text
C. Split into smaller PRs
```

But because the refactor removes authentication behavior and logs payment tokens, the strongest answer is **D**.
