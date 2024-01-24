public class BasicPatternMatchingForSwitch {
    public static void main(String[] args) {
        Object obj = "Hello";

        // Using pattern matching for switch
        switch (obj) {
            case String s -> System.out.println("String length: " + s.length());
            case Integer i -> System.out.println("Integer value: " + i);
            case Double d -> System.out.println("Double value: " + d);
            default -> System.out.println("Unknown type");
        }
    }
}
