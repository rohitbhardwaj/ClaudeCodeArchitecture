# Missing Tests Participants Should Identify

The generated test suite is weak.

## Missing Behavior Tests

```text
no discount preserves original total behavior
discount does not change tax semantics without approval
discount larger than subtotal is rejected
zero or negative item quantities are rejected
```

## Missing API Compatibility Tests

```text
receipt fields remain backward compatible
error contract is preserved
existing clients can ignore discount fields safely
```

## Missing Security Tests

```text
unauthorized customer cannot use VIP discount
expired discount is rejected
discount code cannot be brute-forced
discount code is not logged
```

## Missing Data Model Tests

```text
discount code is persisted
discount amount is persisted
discount campaign id is persisted where required
```

## Missing Observability Tests

```text
accepted discount emits audit event
rejected discount emits audit event
audit event does not contain sensitive data
```

## Missing Rollback Tests

```text
discounts are disabled when feature flag is off
checkout still works when promotion service is unavailable
```
