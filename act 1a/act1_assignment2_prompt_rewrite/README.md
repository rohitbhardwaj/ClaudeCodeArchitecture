# Act 1 — Assignment 2: Before/After Prompt Rewrite

## Scenario

A developer wants Claude Code to improve a legacy checkout module.

Original weak prompt:

```text
Improve this checkout code and make it production ready.
```

## Architect Task

Rewrite the weak prompt into a governed engineering prompt.

The governed prompt must require Claude Code to:

1. Analyze first, do not code yet.
2. Summarize current behavior.
3. Identify impacted files.
4. Preserve public API behavior.
5. Do not remove or weaken tests.
6. Identify architecture risks.
7. Propose a small-step plan.
8. Ask for approval before modifying files.

## Learning Goal

Architects should understand that vague prompts delegate too much authority. A governed prompt gives Claude Code a clear role, constraints, review boundaries, and safety expectations.

## Recommended Flow

| Step | Activity | Time |
|---|---|---:|
| 1 | Read the legacy checkout class | 5 min |
| 2 | Review the weak prompt | 2 min |
| 3 | Identify what is missing | 5 min |
| 4 | Rewrite into a governed prompt | 8 min |
| 5 | Compare with sample answer | 5 min |
| 6 | Reflection discussion | 5 min |

Total: **30 minutes**

## Files in This Kit

```text
act1_assignment2_prompt_rewrite/
├── README.md
├── docs/
│   ├── assignment_instructions.md
│   ├── facilitator_guide.md
│   ├── expected_findings.md
│   ├── debrief_script.md
│   └── line_by_line_teaching_notes.md
├── prompts/
│   ├── weak_prompt.txt
│   ├── governed_prompt_template.md
│   └── strong_sample_answer.md
├── rubrics/
│   └── prompt_review_rubric.md
├── templates/
│   ├── participant_worksheet.md
│   └── reflection_sheet.md
└── src/
    ├── main/java/com/acme/checkout/
    │   ├── CheckoutController.java
    │   ├── LegacyCheckoutService.java
    │   ├── CheckoutRequest.java
    │   ├── CheckoutResponse.java
    │   ├── CheckoutItem.java
    │   ├── PaymentGateway.java
    │   ├── InventoryClient.java
    │   ├── CartClient.java
    │   ├── OrderClient.java
    │   ├── AuditLogger.java
    │   └── UserContext.java
    └── test/java/com/acme/checkout/
        └── LegacyCheckoutServiceTest.java
```

## Core Takeaway

> A vague prompt asks Claude Code to decide both the implementation and the architecture.  
> A governed prompt asks Claude Code to analyze, explain, constrain, plan, and wait for human approval before changing the system.
