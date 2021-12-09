package lesson2.lecture.assignment.Prob2b;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> orderLines;
    private int orderNum;
    private LocalDateTime orderDate;

    Order(int orderNum, LocalDateTime orderDate) {
        this.orderLines = new ArrayList<>();
        this.orderNum = orderNum;
        this.orderDate = orderDate;
    }


    public void addOrderLine(int lineNum, double price, int quantity) {
        OrderLine line = new OrderLine(this, lineNum, price, quantity);
        orderLines.add(line);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderLines=" + orderLines +
                ", orderNum=" + orderNum +
                ", orderDate=" + orderDate +
                '}';
    }
}
