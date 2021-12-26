package prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("\nall transactions from year 2011 and sort by value");

        transactions.stream()
                .filter(a -> a.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);


        // Query 2: What are all the unique cities where the traders work?
        System.out.println("\nUnique cities where traders work");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);


        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("\nall traders from Cambridge and sort them by name");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(a -> a.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);


        // Query 4: Return a string of all traders names sorted alphabetically.
        String result = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("\nAll traders name sorted alphabetically \n" + result);


        // Query 5: Are there any trader based in Milan?
        boolean traderBasedOnMilan = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(a -> a.getCity().equals("Milan"));
        System.out.println("\nAre there any trader based in Milan? " + traderBasedOnMilan);

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(a -> a.getCity().equals("Milan"))
                .forEach(a -> a.setCity("Cambridge"));
        System.out.println("\nTraders from milan are set to Cambridge");

        System.out.println("\nAll Traders List (to check city is set to cambridge or not)");
        transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .forEach(System.out::println);


        // Query 7: What's the highest value in all the transactions?
        int value = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElse(0);
        System.out.println("\nHighest value in all the transactions = " + value);

    }
}
