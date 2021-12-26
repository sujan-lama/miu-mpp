package prob3;

import java.util.Arrays;
import java.util.List;

public class prob3 {
    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(e -> e.length() == len)
                .filter(e -> e.contains("" + c))
                .filter(e -> !e.contains("" + d))
                .count();
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "sujan", "lama", "java");
        System.out.println("word count : " + countWords(words, 's', 'm', 5));
    }
}
