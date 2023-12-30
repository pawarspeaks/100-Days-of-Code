import java.util.Objects;

record Person(String name, int age) {
    public Person {
        Objects.requireNonNull(name);
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Is adult? " + person.isAdult());
    }
}
