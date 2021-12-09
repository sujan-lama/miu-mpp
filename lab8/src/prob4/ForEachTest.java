package prob4;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");

        //foreach using lambda
        System.out.println("Lambda for each");
        fruits.forEach(fruit -> System.out.println(fruit));


        //foreach using method reference
        System.out.println("\nMethod Reference for each");
        fruits.forEach(System.out::println);


    }
}
