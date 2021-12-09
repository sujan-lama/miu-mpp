package prob1;

public interface Squeak extends QuackBehavior {
    default void quack() {
        System.out.println("quack by squeaking");
    }
}
