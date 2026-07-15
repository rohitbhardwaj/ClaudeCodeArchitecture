# Context Map Generation Prompt

Use this prompt to make Claude produce a context map before coding.

```text
Create a repo context map for this task before modifying any files.

Task:
[Insert task]

Return:

1. Entry point:
2. Core business logic:
3. External dependencies:
4. Data/persistence:
5. Tests:
6. API contract:
7. Security-sensitive areas:
8. Files Claude may inspect:
9. Files Claude may modify only after approval:
10. Files Claude must not modify:

After the map, list:
- behavior that must remain unchanged
- likely risks
- missing tests
- suggested first safe step

Do not modify files.
```
