package prob5;

import java.util.Arrays;

public class Prob5 {

    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY" };


        // sort by ignore case using method reference
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
