package probC;


public class Salaried extends Employee {
    private final double salary;

    public Salaried(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }


    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }
}
