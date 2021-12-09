package prob2;

public class Main {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        landlord.addBuilding(22000, 5, 40000);
        landlord.addBuilding(32000, 2, 10000);
        System.out.println("total profit is " + landlord.getProfit());
    }
}
