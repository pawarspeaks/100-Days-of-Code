public class BasicLocalVariableTypeInference {
    public static void main(String[] args) {
        // Using var for local variable type inference
        var message = "Hello, Java!"; // Inferred as String

        // Var can be used in a variety of situations
        var numbers = new int[]{1, 2, 3, 4, 5}; // Inferred as int[]

        // Var in enhanced for loop
        for (var number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Var in a try-with-resources statement
        try (var resource = new MyResource()) {
            resource.use();
        }
    }
}

class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource closed");
    }

    public void use() {
        System.out.println("Resource used");
    }
}
