package prob1.test;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {
        DoubleFunction<Double> km = m -> 1.6 * m;
        System.out.println("1 miles is " + km.apply(1) + " km");

//        MyIface rand = () -> new Random().nextInt();

        Supplier<Integer> randSupplier = () -> new Random().nextInt();
//        System.out.println("Random number is " + rand.produce());
        System.out.println("Random number by supplier is " + randSupplier.get());
    }

}
