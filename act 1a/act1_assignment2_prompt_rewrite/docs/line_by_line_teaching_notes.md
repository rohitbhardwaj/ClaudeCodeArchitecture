# Line-by-Line Teaching Notes

Use these notes when walking through `LegacyCheckoutService.java`.

## Main Lesson

The legacy checkout module has many production-sensitive responsibilities. A vague prompt may cause Claude Code to “clean up” the code by changing behavior, moving logic across boundaries, or weakening tests.

## Areas Participants Should Notice

### Constructor dependencies

The service depends on:

- `PaymentGateway`
- `InventoryClient`
- `CartClient`
- `OrderClient`
- `AuditLogger`

These represent architecture boundaries. The prompt should tell Claude Code to preserve them unless the architect approves a boundary change.

### Authentication check

The code checks `UserContext` before checkout. This is a security-sensitive behavior. The prompt should require Claude to preserve authentication behavior.

### Request validation

The module validates customer id, cart id, payment token, items, SKU, quantity, and price. These validations are part of the public behavior and must not silently change.

### Inventory check

The service checks inventory before charging payment. The sequence matters. A refactor that charges payment before inventory verification would be a production defect.

### Payment boundary

Payment is handled through `PaymentGateway`. The prompt should say: “Keep payment logic behind the existing payment boundary.”

### Order creation

Order creation is delegated to `OrderClient`. Claude should not move order creation into the checkout service without approval.

### Logging

Logs should not include secrets or payment tokens. The prompt should make this explicit.

### Tests

Existing tests protect current behavior. The prompt must say: “Do not remove or weaken tests.”

## High-Risk Prompt Ambiguities

| Prompt Phrase | Why It Is Risky |
|---|---|
| Improve this code | Does not define improvement. |
| Make it production ready | Does not define quality gates. |
| Clean it up | May cause behavior-changing refactors. |
| Add tests | May generate weak tests that match changed behavior. |
| Refactor freely | May cross architecture boundaries. |

## Teaching Close

> The safer prompt does not ask Claude Code to be less powerful. It asks Claude Code to use its power inside explicit architecture constraints.
