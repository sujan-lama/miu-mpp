package prob6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob6 {
    public static Set<String> union(List<Set<String>> sets) {
        //using reduce
        return sets.stream()
                .reduce((a, b) -> Stream.concat(a.stream(), b.stream()).collect(Collectors.toSet()))
                .orElse(Set.of());

    }

    public static Set<String> unionUsingFlatMap(List<Set<String>> sets) {
        //using flat map
        return sets.stream()
                .flatMap(Collection::stream).collect(Collectors.toSet());
    }


    public static void main(String[] args) {
        List<Set<String>> sets = Arrays.asList(Set.of("A", "B"), Set.of("D"), Set.of("1", "3", "5"));
        System.out.println(union(sets));
        System.out.println("\nUsing Flat Map");
        System.out.println(unionUsingFlatMap(sets));
    }

}
