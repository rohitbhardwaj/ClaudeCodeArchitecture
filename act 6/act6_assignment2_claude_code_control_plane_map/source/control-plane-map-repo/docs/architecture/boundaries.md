# Architecture Boundaries

## Controller

Transport mapping only.

## Service

Use-case orchestration.

## Domain

Business rules.

## External Integrations

Adapters and clients must be isolated.

## Claude Rule

Claude must not move business logic into controllers.
