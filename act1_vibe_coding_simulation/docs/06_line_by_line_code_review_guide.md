# Line-by-Line Code Review Guide

This guide explains what participants should notice in the commented Java files.

## Original Service

Important lines and behaviors to protect:

| Area | Behavior to Preserve |
|---|---|
| Authentication | `userContext == null || !userContext.isAuthenticated()` returns `UNAUTHORIZED` |
| Null request | Missing request returns `INVALID_ORDER` |
| Customer validation | Null or blank customer id returns `INVALID_CUSTOMER` |
| Item validation | Empty item list returns `EMPTY_ORDER` |
| Payment validation | Null or blank payment token returns `INVALID_PAYMENT` |
| SKU validation | Null or blank SKU returns `INVALID_ITEM` |
| Quantity validation | Quantity less than or equal to zero returns `INVALID_QUANTITY` |
| Inventory behavior | Unavailable item returns `OUT_OF_STOCK` |
| Payment behavior | Declined payment returns `PAYMENT_DECLINED` |
| Logging | Customer and order ids may be logged; payment token must not be logged |

## Refactored Service

Problems to catch:

| Refactor Area | Issue |
|---|---|
| Authentication | `userContext` is accepted but ignored |
| Error contract | Specific error codes collapse into `BAD_REQUEST` |
| Customer validation | Blank customer id now passes |
| Payment validation | Blank payment token now passes |
| SKU validation | Blank SKU now passes |
| Quantity validation | Zero quantity now passes |
| Inventory behavior | `OUT_OF_STOCK` becomes generic `BAD_REQUEST` |
| Payment behavior | `PAYMENT_DECLINED` becomes `PAYMENT_FAILED` |
| Logging | Payment token is logged on failure and success |
| Architecture | `OrderValidator` is directly constructed instead of injected |
| Reviewability | Too many concerns changed in one PR |

## Test Review

The refactored tests are dangerous because they pass while hiding regressions.

Removed or weakened protections:

- Authentication test removed
- Zero quantity test removed
- Out-of-stock error contract test removed
- Specific error-code expectations weakened
- No test asserts that payment token is not logged

## Discussion Question

What would your team’s review process catch automatically, and what would still depend on human architecture judgment?
