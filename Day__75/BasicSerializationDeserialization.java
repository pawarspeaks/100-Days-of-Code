import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    // Constructors, getters, and setters (omitted for brevity)

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class BasicSerializationDeserialization {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person();
        person.setName("John");
        person.setAge(25);

        // Serialization: Writing object to a file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            outputStream.writeObject(person);
            System.out.println("Serialization: Person object written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization: Reading object from a file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) inputStream.readObject();
            System.out.println("Deserialization: Person object read from file");
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
