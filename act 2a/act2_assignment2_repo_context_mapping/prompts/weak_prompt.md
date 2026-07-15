# Weak Prompt

```text
Fix the checkout bug.
```

## Why This Is Weak

It does not say:

```text
analyze first
do not modify files yet
inspect related files
preserve public API behavior
preserve payment behavior
preserve pricing and tax behavior
do not weaken tests
do not log sensitive data
ask for approval before changing high-risk files
```

## Risk

Claude may produce a local fix that passes tests but changes system behavior.
