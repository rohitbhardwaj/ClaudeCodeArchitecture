# Level 2 — Repo-Aware Assistant Prompt Examples

## Dependency Graph

```text
Analyze the checkout module and explain its dependency graph.

Do not modify files.

Include:
1. Entry points.
2. Core business logic.
3. External dependencies.
4. Persistence dependencies.
5. Tests that cover the module.
6. Security-sensitive areas.
7. Possible architecture drift.
```

## Existing Behavior Tests

```text
Generate characterization test suggestions for checkout behavior.

Do not modify files yet.

First summarize:
1. Current behavior.
2. Error responses.
3. Payment behavior.
4. Coupon behavior.
5. Existing test coverage.
6. Missing tests.

Then propose tests that preserve current behavior.
```

## Architecture Drift Analysis

```text
Analyze this repository for architecture drift.

Do not modify files.

Look for:
1. Business logic in controllers.
2. Direct infrastructure calls from domain logic.
3. Duplicated validation rules.
4. Circular dependencies.
5. Weak test boundaries.
6. Security-sensitive shortcuts.

Return findings with file references and risk level.
```
