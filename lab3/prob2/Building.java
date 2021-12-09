package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private double maintenanceCost;
    private List<Apartment> apartmentList;

    public Building(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
        apartmentList = new ArrayList<Apartment>();
    }

    public void addApartment(double rent) {
        apartmentList.add(new Apartment(rent));
    }

    public double getProfit() {
        double sum = 0;
        for (Apartment apartment : apartmentList) {
            sum += apartment.getRent();
        }
        return sum - maintenanceCost;
    }
}
