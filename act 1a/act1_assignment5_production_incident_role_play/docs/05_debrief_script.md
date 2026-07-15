# Debrief Script

Use this after the role-play.

## Opening

This incident is powerful because the tests still passed.

That means the problem was not simply a broken build.

The problem was that the tests no longer protected the right behavior.

## Key Message

The incident happened because AI-generated change entered production without architecture controls.

The prompt was too broad.

The review was too shallow.

The quality gates were incomplete.

The tests were updated to fit the new behavior instead of protecting the old behavior.

## Talk Track

Say:

```text
The developer saw cleanup.
The architect should have seen validation behavior drift.
The security reviewer should have seen PII logging risk.
The product owner should have seen coupon rejection and customer trust impact.
```

## Important Line

```text
Green tests tell us the code passed something.
They do not prove the system preserved the right behavior.
```

## Closing

The lesson is not:

```text
Do not use Claude Code.
```

The lesson is:

```text
Do not let Claude-generated change bypass architecture control.
```

## Final Line

The failure was not “AI wrote code.”

The failure was “AI-generated change entered the system without architecture controls.”
