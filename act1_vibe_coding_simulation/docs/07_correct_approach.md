# The Correct Approach

This is the process that would have prevented every issue found in [03_expected_findings.md](03_expected_findings.md). It is not just a better prompt — it is a different workflow.

## Step 1 — Separate Planning From Modification

The original prompt let the agent plan and modify in the same pass:

```text
Clean up the OrderService and add tests.
```

The fix is a two-phase workflow. Phase one produces a plan and touches no files. Phase two executes only what was approved. See [05_restart_prompt.md](05_restart_prompt.md) for the exact prompt that enforces this split.

## Step 2 — Capture Current Behavior Before Touching Code

Before any refactor, the agent should have been asked to enumerate, in writing:

- Every public error code and the condition that produces it
- Every validation rule, including edge cases like blank strings and zero quantities
- The authentication check and where it sits in the flow
- What is logged, and the explicit rule that payment tokens are never logged

This list is a contract. A refactor is only "clean" if it produces identical answers to this list before and after. Without writing it down first, "the tests still pass" is the only signal available, and generated tests can quietly encode the new (wrong) behavior instead of the old one — which is exactly what happened here.

## Step 3 — Add Characterization Tests Before Refactoring, Not After

The refactor and the tests were generated together, in the same pass, by the same prompt. That means the tests could not catch regressions in the refactor — they were derived from the same misunderstanding.

The correct order is:

1. Write or generate tests against the **original** code first, covering every item from Step 2.
2. Confirm those tests pass against the original implementation.
3. Only then refactor, with instructions to keep those tests green without editing their assertions.

If a refactor requires changing a test's expected value, that is a signal to stop and ask a human, not to update the assertion and move on.

## Step 4 — Make Non-Negotiable Constraints Explicit and Non-Deletable

Several regressions were not subtle — they were the removal of an entire check (authentication) or an entire rule (never log secrets). These should not depend on the reviewer noticing a diff. They belong in standing project rules that every prompt inherits, for example in `CLAUDE.md`:

```text
- Never remove or bypass an authentication check without explicit human approval.
- Never log payment tokens, credentials, or other secrets, in any code path.
- Public error codes are part of the API contract. Do not rename, merge, or remove
  an error code without explicit approval.
- Do not weaken or delete an existing test to make a refactor pass. If a refactor
  breaks a test, fix the refactor or flag it — do not edit the assertion.
```

Constraints stated once in a prompt can be forgotten on the next prompt. Constraints stated in project configuration apply to every future change, including ones nobody remembers to re-specify.

## Step 5 — Keep the Change Small Enough to Review

The generated PR bundled six unrelated changes: a refactor, a validation behavior change, an error contract change, a logging change, a test rewrite, and a new class. No reviewer, however careful, reliably catches every regression in a PR that wide.

The correct scope for a first pass is one concern:

```text
PR 1: Extract validation into OrderValidator. No behavior change. No new
      error codes. No test deletions. Inject OrderValidator as a constructor
      dependency, matching the existing pattern.
```

Behavior changes, if wanted, become their own PR, reviewed and approved on their own terms — not smuggled in alongside a rename.

## Step 6 — Review for Behavior and Boundaries, Not Just for "Cleaner"

Green tests answer one question: does the code do what the tests check? They do not answer whether the tests still check the right things. The review sheet in [02_architect_review_sheet.md](02_architect_review_sheet.md) exists because "cleaner and green" was never sufficient by itself — the review has to independently re-ask what behavior, security, and error contracts looked like before, and compare.

## How Each Finding Maps Back to a Missed Step

| Finding (from 03) | Step That Would Have Caught It |
|---|---|
| Authentication check removed | Step 2 (behavior inventory) + Step 4 (non-negotiable rule) |
| Payment token logged | Step 4 (non-negotiable rule) |
| Error codes collapsed | Step 2 (behavior inventory) + Step 4 (error codes are contract) |
| Validation weakened (blank strings, zero quantity) | Step 3 (characterization tests written against the original first) |
| Tests weakened | Step 3 (tests generated before the refactor, not alongside it) |
| Helper class constructed directly instead of injected | Step 5 (small, single-concern PR makes this easy to spot) |
| Too many concerns in one PR | Step 5 (scope discipline) |

## Closing Line

None of these steps require distrusting the agent. They require never asking it to plan, change behavior, and grade its own homework in a single ungoverned pass.
