public class AdvancedPatternMatchingDemo {
    public static void main(String[] args) {
        Object obj = "Hello";

        if (obj instanceof String str && str.length() > 5) {
            System.out.println("String is longer than 5 characters");
        } else {
            System.out.println("Not a valid string or shorter than 5 characters");
        }
    }
}
