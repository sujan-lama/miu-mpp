package prob10;

import prob7b.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

class Human {
    String name;
    int age;
    String gender;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

public class ConstructorReference {
    public static void main(String args[]) {
        Human[] list = {new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male")};

        // Query 1  : Print only Female candidates names
        System.out.println("\nOnly Female candidates names");
        Stream.of(list)
                .filter(a -> a.getGender().equals("Female"))
                .map(Human::getName)
                .forEach(System.out::println);

        // Query 2 : Create an object by choosing suitable Interface to the specified constructors(Totally 3 constructors) using fourth type of Method Reference ClassName::new. Then print the object status

        Function<String, Human> object1 = Human::new;
        Human o1 = object1.apply("Kurt Cobain");

        BiFunction<String, Integer, Human> object2 = Human::new;
        Human o2 = object2.apply("John Mayer", 26);

        TriFunction<String, Integer, String, Human> object3 = Human::new;
        Human o3 = object3.apply("Sujan Lama", 26, "Male");
        System.out.println("\nHuman from constructor 1 : " + o1);
        System.out.println("Human from constructor 2 : " + o2);
        System.out.println("Human from constructor 3 : " + o3);

        // Query 3 : Count the male candidates whose age is more than 30
        int count = (int) Stream.of(list)
                .filter(a -> a.getGender().equals("Male"))
                .filter(a -> a.getAge() > 30)
                .count();
        System.out.println("\nMale candidates whose age is more than 30 =  " + count);


    }


}
