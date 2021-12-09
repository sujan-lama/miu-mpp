package prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {

    private List<Building> buildings;

    public Landlord() {
        buildings = new ArrayList<>();
    }

    public void addBuilding(int maintenanceCost, int numberOfApartment, double rent) {
        Building building = new Building(maintenanceCost);
        for (int i = 0; i < numberOfApartment; i++) {
            building.addApartment(rent);
        }
        buildings.add(building);
    }

    public double getProfit() {
        double profit = 0;
        for (Building building : buildings) {
            profit += building.getProfit();
        }
        return profit;
    }

    public List<Building> getBuildings() {
        return buildings;
    }
}
