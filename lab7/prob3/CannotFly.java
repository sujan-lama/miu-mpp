package prob1;

public interface CannotFly extends FlyBehavior {
    default void fly() {
        System.out.println("cannot fly");
    }
}
