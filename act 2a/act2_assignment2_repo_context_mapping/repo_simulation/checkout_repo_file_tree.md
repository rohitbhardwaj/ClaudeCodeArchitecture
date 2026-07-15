# Simulated Checkout Repository File Tree

```text
checkout-service/
├── CLAUDE.md
├── README.md
├── openapi.yaml
├── src/
│   ├── main/
│   │   └── java/com/acme/checkout/
│   │       ├── CheckoutController.java
│   │       ├── CheckoutService.java
│   │       ├── PricingCalculator.java
│   │       ├── CouponValidator.java
│   │       ├── PaymentClient.java
│   │       ├── InventoryClient.java
│   │       ├── TaxService.java
│   │       ├── Order.java
│   │       └── OrderRepository.java
│   └── test/
│       └── java/com/acme/checkout/
│           ├── CheckoutServiceTest.java
│           ├── CouponValidatorTest.java
│           └── CheckoutIntegrationTest.java
└── .github/
    └── workflows/
        └── ci.yml
```

## Exercise

Before Claude changes code, decide:

```text
what to inspect
what requires approval
what must not be touched
```
