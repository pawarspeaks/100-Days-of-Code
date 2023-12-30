interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + operate(10, 5, addition));
        System.out.println("Subtraction: " + operate(10, 5, subtraction));
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
