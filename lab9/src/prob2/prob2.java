package prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob2 {

    public static void main(String[] args) {
        Stream<Integer> myIntStream = Stream.of(3, 4, 5, 1, 10, 2);
        IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(Integer::valueOf));
        System.out.println("Max value is " + summary.getMax() + " and min is " + summary.getMin());
    }
}
