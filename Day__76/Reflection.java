import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    // Constructors, getters, and setters (omitted for brevity)

    public void displayInfo() {
        System.out.println("Person - Name: " + name + ", Age: " + age);
    }
}

public class BasicReflection {
    public static void main(String[] args) {
        // Getting the class of the Person object
        Class<?> personClass = Person.class;

        // Getting declared fields of the Person class
        Field[] fields = personClass.getDeclaredFields();
        System.out.println("Declared Fields:");
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // Getting declared methods of the Person class
        Method[] methods = personClass.getDeclaredMethods();
        System.out.println("\nDeclared Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Creating an instance of the Person class using reflection
        try {
            Person person = (Person) personClass.newInstance();
            person.setName("Alice");
            person.setAge(30);

            // Invoking the displayInfo method using reflection
            Method displayInfoMethod = personClass.getDeclaredMethod("displayInfo");
            displayInfoMethod.invoke(person);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
