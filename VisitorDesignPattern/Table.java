public class Table implements Furniture {
    private int numLegs;

    public Table(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return numLegs;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}