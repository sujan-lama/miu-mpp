package prob1;

public class MallardDuck extends Duck implements FlyWithWings, Quack {
    @Override
    void display() {
        System.out.println("Displaying mallard");
    }
}
