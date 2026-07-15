# Discussion Questions

Use these questions after participants complete the context map.

## Main Discussion Question

```text
What context would Claude miss if you simply said “fix the bug”?
```

## Follow-Up Questions

### Behavior

```text
What existing checkout behavior must remain unchanged?
```

### API

```text
Which clients depend on the current checkout response?
```

### Security

```text
Where could a checkout fix accidentally expose payment tokens or PII?
```

### Testing

```text
Which tests should fail if the bug fix breaks existing behavior?
```

### Data

```text
Could the fix change what gets persisted?
```

### External Dependencies

```text
Could the bug be caused by PaymentClient, InventoryClient, or TaxService rather than CheckoutService?
```

### Review

```text
Which files should Claude not modify without approval?
```

### Governance

```text
What should CLAUDE.md say before Claude Code works on checkout?
```
