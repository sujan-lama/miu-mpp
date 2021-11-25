package prob4;

public class Trailer implements Property {
    private final Address address;

    public Trailer(Address address) {
        this.address = address;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public double computeRent() {
        return 500;
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "address=" + address +
                '}';
    }
}
