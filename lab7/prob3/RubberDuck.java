package prob1;

public class RubberDuck extends Duck implements Squeak, CannotFly {

    @Override
    void display() {
        System.out.println("Displaying Rubber");
    }
}
