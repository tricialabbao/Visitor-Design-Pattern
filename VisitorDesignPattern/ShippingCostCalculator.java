public class ShippingCostCalculator implements ShippingVisitor {

    private static final double CHAIR_SMALL  = 5.00;
    private static final double CHAIR_MEDIUM = 8.00;
    private static final double CHAIR_LARGE  = 12.00;

    private static final double TABLE_BASE_RATE = 3.50;

    private static final double SOFA_BASE_FEE = 20.00;
    private static final double SOFA_PER_KM   = 0.15;

    @Override
    public double visit(Chair chair) {
        switch (chair.getSize().toLowerCase()) {
            case "small":  return CHAIR_SMALL;
            case "medium": return CHAIR_MEDIUM;
            case "large":  return CHAIR_LARGE;
            default:       return CHAIR_MEDIUM;
        }
    }

    @Override
    public double visit(Table table) {
        return TABLE_BASE_RATE * table.getNumLegs();
    }

    @Override
    public double visit(Sofa sofa) {
        return SOFA_BASE_FEE + (SOFA_PER_KM * sofa.getDistanceKm());
    }
}