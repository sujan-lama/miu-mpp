package prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class prob1 {

    public static void main(String[] args) {

        BiFunction<Double, Double, List<Double>> result = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };
        System.out.println("Result is " + result.apply(2.0,3.0));
    }
}
