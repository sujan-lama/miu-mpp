package lesson2.lecture.assignment.Prob2b;

import java.time.LocalDateTime;

public class Prob2B {

    public static void main(String[] args) {
        Order order = new Order(123, LocalDateTime.now());
        order.addOrderLine(1, 200, 3);
        order.addOrderLine(2, 600, 1);
        order.addOrderLine(3, 100, 8);

        System.out.println("Order is " + order.getOrderLines());

    }
}
