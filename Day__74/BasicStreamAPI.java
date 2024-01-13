import java.util.Arrays;
import java.util.List;

public class BasicStreamAPI {
    public static void main(String[] args) {
        // Creating a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma");

        // Using Stream API to filter and print names starting with 'A'
        System.out.println("Names starting with 'A':");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(filteredName -> System.out.println(filteredName));

        // Using Stream API to transform and print uppercase names
        System.out.println("Uppercase Names:");
        names.stream()
                .map(String::toUpperCase)
                .forEach(uppercaseName -> System.out.println(uppercaseName));

        // Using Stream API to find and print the first name starting with 'D'
        System.out.println("First name starting with 'D':");
        String firstNameWithD = names.stream()
                .filter(name -> name.startsWith("D"))
                .findFirst()
                .orElse("No name found");
        System.out.println(firstNameWithD);
    }
}
