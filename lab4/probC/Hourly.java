package probC;


public class Hourly extends Employee {

    private final double hourlyWage;
    private final double hoursPerWeek;

    public Hourly(String empId, double hourlyWage, double hoursPerWeek) {
        this.empId = empId;
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }



    @Override
    public double calcGrossPay(int month, int year) {
        return 4 * hoursPerWeek * hourlyWage;
    }
}
