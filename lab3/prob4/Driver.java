package prob4;


import java.util.List;

public class Driver {

    public static void main(String[] args) {

        Property house = new House(9000, new Address("1000 N. 4th St.", "Fairfield", "IA", 52557));
        Property condo = new Condo(2, new Address("1000 N. 4th St.", "Iowa City", "IA", 52557));
        Property trailer = new Trailer(new Address("1000 N. 4th St.", "Fairfield", "IA", 52557));
        List<Property> propertyList = List.of(house, condo, trailer);
        double totalRent = Admin.computeTotalRent(propertyList);
        System.out.println(totalRent);


        List<Property> searchedProperty = Admin.listAllPropertiesByCity(propertyList, "Fairfield");
        System.out.println(searchedProperty);
    }
}
