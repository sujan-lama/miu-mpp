package prob4;

public class House implements Property {

    private final double lotSize;

    private Address address;

    public House(double lotSize, Address address) {
        this.lotSize = lotSize;
        this.address = address;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    public double getLotSize() {
        return lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * getLotSize();
    }

    @Override
    public String toString() {
        return "House{" +
                "lotSize=" + lotSize +
                ", address=" + address +
                '}';
    }
}
