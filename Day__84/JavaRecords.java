public record Person(String name, int age) {
    // Additional methods and constructors can be added if needed
}

public class BasicJavaRecords {
    public static void main(String[] args) {
        // Creating an instance of the record
        Person person = new Person("Alice", 25);

        // Accessing fields using record's automatically generated accessor methods
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Records provide a concise and readable way to define data-carrying classes
        System.out.println("Person Record: " + person);
    }
}
