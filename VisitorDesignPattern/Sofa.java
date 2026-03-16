public class Sofa implements Furniture {
    private double distanceKm;

    public Sofa(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}