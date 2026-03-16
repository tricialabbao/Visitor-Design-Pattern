public class Chair implements Furniture {
    private String size;

    public Chair(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}