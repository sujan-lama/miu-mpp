package prob9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }


    public enum Type {MEAT, FISH, OTHER;}

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                    new Dish("beef", false, 700, Dish.Type.MEAT),
                    new Dish("chicken", false, 400, Dish.Type.MEAT),
                    new Dish("french fries", true, 530, Dish.Type.OTHER),
                    new Dish("rice", true, 350, Dish.Type.OTHER),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("prawns", false, 400, Dish.Type.FISH),
                    new Dish("salmon", false, 450, Dish.Type.FISH));

    public static boolean hasVegetarian() {
        return menu.stream().anyMatch(Dish::isVegetarian);
    }

    public static boolean hasHealthyMenu() {
        return menu.stream().anyMatch(a -> a.getCalories() < 1000);
    }

    public static boolean hasUnhealthyMenu() {
        return menu.stream().noneMatch(a -> a.getCalories() < 1000);
    }

    public static Optional<Dish> getFirstMeatItem() {
        return menu.stream()
                .filter(a -> a.getType() == Type.MEAT)
                .findFirst();
    }

    public static int getTotalCalories() {
        return menu.stream()
                .mapToInt(Dish::getCalories)
                .reduce(0, (a, b) -> a + b);
    }

    public static int getTotalCaloriesMR() {
        return menu.stream()
                .mapToInt(Dish::getCalories)
                .reduce(0, Integer::sum);

    }


    public static void main(String[] args) {

        System.out.println("a. Is there any Vegetarian meal available? " + hasVegetarian());

        System.out.println("b. Is there any healthy menu (have calories less than 1000)? " + hasHealthyMenu());

        System.out.println("c. Is there any unhealthy menu (have calories greater than 1000)? " + hasUnhealthyMenu());

        System.out.print("d. find and return the first item for the type of MEAT. ");
        getFirstMeatItem().ifPresent(System.out::println);


        System.out.println("e. calculateTotalCalories() in the menu using reduce");
        System.out.println("Total calories = " + getTotalCalories());

        System.out.println("f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences.");
        System.out.println("Total calories MR = " + getTotalCaloriesMR());
    }

}