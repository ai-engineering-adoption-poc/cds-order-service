# Order Service

The Order Service coordinates the customer order process.

## Main responsibilities

- Validate an order
- Retrieve customer information
- Validate product availability
- Request payment processing
- Trigger order notification

## Downstream services

The service currently communicates with:

1. Customer API
2. Product Catalog
3. Payment Service
4. Notification Service

## Technology

- Java 17
- Spring Boot
- Maven
- REST

## Operational considerations

The service has timeout and retry configuration because it depends on multiple downstream services.
