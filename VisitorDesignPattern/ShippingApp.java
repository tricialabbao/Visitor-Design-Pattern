public class ShippingApp {

    public static void main(String[] args) {

        java.util.List<Furniture> order = new java.util.ArrayList<>();
        order.add(new Chair("small"));
        order.add(new Chair("large"));
        order.add(new Table(4));
        order.add(new Table(6));
        order.add(new Sofa(50.0));
        order.add(new Sofa(120.0));

        ShippingVisitor calculator = new ShippingCostCalculator();

        System.out.println("=== Furniture Shipping Cost Calculator ===\n");

        double total = 0;
        for (Furniture item : order) {
            double cost = item.accept(calculator);
            total += cost;
            System.out.printf("%-30s -> $%.2f%n", item.getClass().getSimpleName()
                    + " (" + describe(item) + ")", cost);
        }

        System.out.printf("%n%-30s -> $%.2f%n", "TOTAL", total);
    }

    private static String describe(Furniture item) {
        if (item instanceof Chair) return "size: " + ((Chair) item).getSize();
        if (item instanceof Table) return ((Table) item).getNumLegs() + " legs";
        if (item instanceof Sofa)  return ((Sofa) item).getDistanceKm() + " km";
        return "";
    }
}