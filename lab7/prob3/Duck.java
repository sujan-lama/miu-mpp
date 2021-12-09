package prob1;

public abstract class Duck implements FlyBehavior, QuackBehavior {

    public void swim() {
        System.out.println("swimming");
    }

    abstract void display();
}
