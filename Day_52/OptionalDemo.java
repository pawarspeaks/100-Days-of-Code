import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String name = "John";
        Optional<String> optionalName = Optional.ofNullable(name);

        System.out.println("Name is present: " + optionalName.isPresent());
        optionalName.ifPresent(n -> System.out.println("Name: " + n));

        String nullName = null;
        Optional<String> optionalNullName = Optional.ofNullable(nullName);
        System.out.println("Null Name is present: " + optionalNullName.isPresent());
    }
}
