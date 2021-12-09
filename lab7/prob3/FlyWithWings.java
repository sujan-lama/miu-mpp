package prob1;

public interface FlyWithWings extends FlyBehavior {
    default void fly() {
        System.out.println("fly with wings");
    }
}
