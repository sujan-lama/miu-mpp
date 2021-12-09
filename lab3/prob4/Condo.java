package prob4;

public class Condo implements Property {
    private int numFloors;

    private Address address;

    public Condo(int numFloors, Address address) {
        this.numFloors = numFloors;
        this.address = address;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    public int getNumFloors() {
        return numFloors;
    }

    @Override
    public double computeRent() {
        return 400 * getNumFloors();
    }

    @Override
    public String toString() {
        return "Condo{" +
                "numFloors=" + numFloors +
                ", address=" + address +
                '}';
    }
}
