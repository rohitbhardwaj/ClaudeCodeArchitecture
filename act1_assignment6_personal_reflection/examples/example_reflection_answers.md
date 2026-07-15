# Example Reflection Answers

## 1. Where are we already doing vibe coding?

```text
We ask AI to “clean up” services without defining behavior that must remain unchanged.
```

## 2. Which tasks are safe for Claude Code today?

```text
Read-only code explanation, module summaries, draft documentation, test suggestions, and risk analysis.
```

## 3. Which tasks require architect approval?

```text
Changes to authentication, authorization, payments, pricing, refunds, tax, public APIs, database migrations, and large refactors.
```

## 4. Which repeated review comment should become written guidance?

```text
Do not put business logic in controllers. Controllers should validate transport-level input and delegate to application services.
```

## 5. What is one rule we should add to CLAUDE.md?

```text
Before refactoring legacy behavior, Claude must add characterization tests, summarize current behavior, identify impacted files, and wait for approval before modifying production code.
```

## Closeout Rule

```text
Preserve public API error codes unless a contract change has been explicitly approved.
```

## Where This Rule Should Live

```text
CLAUDE.md
API contract tests
pull request checklist
CODEOWNERS for public API files
```
