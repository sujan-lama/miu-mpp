package prob1;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack{
    @Override
    void display() {
        System.out.println("Displaying Decoy");
    }

}