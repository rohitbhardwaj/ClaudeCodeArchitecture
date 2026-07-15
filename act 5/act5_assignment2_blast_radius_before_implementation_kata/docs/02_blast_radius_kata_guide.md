# Blast Radius Kata Guide

## Why This Kata Matters

A request like:

```text
Add promotional discount codes during checkout.
```

sounds like a small feature.

But it can affect:

```text
what customers see
what the API returns
how totals are calculated
how tax is computed
what payment amount is charged
how refunds work
whether coupons can be abused
what data is stored
what analytics report
what support can explain
what logs reveal
what tests must prove
how rollback works
who must approve
```

## Strong Pattern

Before implementation, ask Claude to map blast radius.

## What Good Answers Do

Good answers do not jump to implementation.

They identify impact areas, risk, approval owners, test needs, and rollback strategy.

## Core Rule

```text
Do not let Claude implement a feature before the blast radius is known.
```
