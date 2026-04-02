# Furniture Shipping Cost Calculator — Visitor Design Pattern

A Java implementation of the **Visitor Design Pattern** that calculates shipping costs for different types of furniture.

## What It Does
- Calculates shipping costs for chairs, tables, and sofas
- Each furniture type has its own pricing logic
- Uses the Visitor pattern to separate cost calculation from the furniture classes

## How Shipping is Calculated

| Furniture | Pricing |
|-----------|---------|
| Chair (small) | $5.00 |
| Chair (medium) | $8.00 |
| Chair (large) | $12.00 |
| Table | $3.50 × number of legs |
| Sofa | $20.00 base + $0.15 per km |

## Project Structure
```
VisitorDesignPattern/
├── Furniture.java               — Interface with accept() method
├── Chair.java                   — Furniture type (size-based pricing)
├── Table.java                   — Furniture type (leg-based pricing)
├── Sofa.java                    — Furniture type (distance-based pricing)
├── ShippingVisitor.java         — Visitor interface
├── ShippingCostCalculator.java  — Concrete visitor with pricing logic
└── ShippingApp.java             — Main entry point
```

## Design Pattern

- **Visitor** — `ShippingVisitor` / `ShippingCostCalculator`
- **Element** — `Furniture` interface with `accept()`
- **Concrete Elements** — `Chair`, `Table`, `Sofa`

