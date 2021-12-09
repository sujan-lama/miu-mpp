package probC;

import java.time.LocalDate;

public class Order {
    private final String orderNo;
    private final LocalDate orderDate;
    private final double orderAmount;

    public Order(String orderNo, LocalDate orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
