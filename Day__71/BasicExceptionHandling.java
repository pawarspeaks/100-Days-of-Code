public class BasicExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't execute if an exception occurs
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed");
        } finally {
            // Finally block executes whether an exception occurs or not
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues after exception handling");
    }

    public static int divide(int num, int denom) {
        // Method that may throw an exception
        return num / denom;
    }
}
