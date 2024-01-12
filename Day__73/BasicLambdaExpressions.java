import java.util.ArrayList;
import java.util.List;

public class BasicLambdaExpressions {
    public static void main(String[] args) {
        // Creating a list of numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Using lambda expression to iterate and print each element
        numbers.forEach(number -> System.out.println("Number: " + number));

        // Using lambda expression for filtering and printing even numbers
        System.out.println("Even Numbers:");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(evenNumber -> System.out.println("Even Number: " + evenNumber));
    }
}
