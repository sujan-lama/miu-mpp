package prob2;

import java.util.Arrays;
import java.util.List;

public class prob2 {

    public static <T> T secondSmallest(List<T> list) {
        return list.stream()
                .sorted()
                .skip(1)
                .findFirst().orElse(null);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 12, 32, 12);
        System.out.println(secondSmallest(list));
    }

}
