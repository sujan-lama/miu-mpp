package prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Integer, Character, String> triFilter = (list, maxSalary, fromCharacter) ->
            list.stream()
                    .filter(e -> e.getSalary() > maxSalary)
                    .filter(e -> e.getLastName().charAt(0) >= fromCharacter)
                    .map(Employee::getFullName)
                    .sorted()
                    .collect(Collectors.joining(", "));

}
