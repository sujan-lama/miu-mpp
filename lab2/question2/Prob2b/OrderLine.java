package lesson2.lecture.assignment.Prob2b;

public class OrderLine {
    private int linenum;
    private double price;
    private int quantity;
    private Order order;

    OrderLine(Order order, int linenum, double price, int quantity) {
        this.linenum = linenum;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }


    public int getLinenum() {
        return linenum;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "linenum=" + linenum +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
