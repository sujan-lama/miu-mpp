package probC;


import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {

    private final List<Order> soldOrders;
    private final double commission;
    private final double baseSalary;


    public Commissioned(String empId, double commission, double baseSalary, List<Order> soldOrders) {
        this.empId = empId;
        this.soldOrders = soldOrders;
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    private double getPreviousMonthOrder(int month, int year) {
        LocalDate currentDate = LocalDate.of(year, month, 1);
        LocalDate prevMonth = currentDate.minusMonths(1);
        double totalOrders = 0;
        for (Order order : soldOrders) {
            if (order.getOrderDate().getMonth() == prevMonth.getMonth()
                    && order.getOrderDate().getYear() == prevMonth.getYear()) {
                totalOrders += order.getOrderAmount();
            }
        }
        return commission * totalOrders;

    }

    @Override
    public double calcGrossPay(int month, int year) {
        return getPreviousMonthOrder(month, year) + baseSalary;
    }
}
