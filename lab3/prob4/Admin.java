package prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    public static double computeTotalRent(List<Property> properties) {
        double totalRent = 0;
        for (Property o : properties) {
            if (o != null) {
                totalRent += o.computeRent();
            }
        }
        return totalRent;
    }

    public static List<Property> listAllPropertiesByCity(List<Property> propertyList, String city) {
        List<Property> properties = new ArrayList<>();
        for (Property property : propertyList) {
            if (property.getAddress().getCity().equals(city)) {
                properties.add(property);
            }
        }
        return properties;
    }
}
