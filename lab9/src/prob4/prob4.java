package prob4;

import java.util.stream.IntStream;

public class prob4 {

    public static void printSquares(int num) {
        IntStream.iterate(1, a -> a + 1).limit(num).map(n -> n * n).forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSquares(5);
    }
}
