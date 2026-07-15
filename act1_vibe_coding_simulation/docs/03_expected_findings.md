# Expected Architect Findings

Participants should ideally find the following issues.

## 1. Authentication Check Was Removed

The original service checked whether the user was authenticated.

The refactored service ignores `UserContext` entirely.

### Risk

Unauthenticated users may be able to place orders.

### Category

Security, behavior, production risk.

---

## 2. Payment Token Is Logged

The refactored code logs the payment token in both success and failure paths.

### Risk

Payment tokens, secrets, or sensitive credentials can leak into logs.

### Category

Security, compliance, privacy.

---

## 3. Specific Error Codes Were Replaced

Original behavior returned specific error codes such as:

```text
UNAUTHORIZED
INVALID_CUSTOMER
INVALID_QUANTITY
OUT_OF_STOCK
PAYMENT_DECLINED
```

The refactor collapses many of these into:

```text
BAD_REQUEST
PAYMENT_FAILED
```

### Risk

API clients, monitoring dashboards, and support workflows may depend on specific error codes.

### Category

Behavior, API compatibility, observability.

---

## 4. Validation Was Weakened

The refactor allows:

- Blank customer IDs
- Blank payment tokens
- Zero-quantity order items
- Blank SKUs

### Risk

Invalid orders may enter the system.

### Category

Behavior, data integrity, security.

---

## 5. Tests Were Weakened

Tests for unauthenticated users and zero quantity were removed.

New tests accept generic error codes instead of preserving specific production behavior.

### Risk

The test suite now validates the changed behavior instead of protecting the original behavior.

### Category

Testing, regression protection.

---

## 6. New Helper Class Was Directly Constructed

The refactored service directly creates `OrderValidator`.

### Risk

This makes validation harder to inject, mock, configure, or replace.

### Category

Architecture, testability, maintainability.

---

## 7. PR Mixed Too Many Changes

The PR includes:

- Refactoring
- Validation behavior changes
- Error contract changes
- Logging changes
- Test changes
- New helper class

### Risk

The PR is too broad to review safely.

### Category

Reviewability, release safety.

---

# Recommended Decision

```text
D. Reject and restart with a plan-first prompt
```

The PR should not be approved because it introduced security and behavior regressions while weakening the tests that should have caught them.
