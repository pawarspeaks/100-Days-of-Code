public class JavaExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            // Handling the arithmetic exception
            System.err.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            // Cleanup code or resources releasing
            System.out.println("Cleaning up resources...");
        }
    }

    public static int divide(int dividend, int divisor) {
        // Method that may throw an exception
        return dividend / divisor;
    }
}
