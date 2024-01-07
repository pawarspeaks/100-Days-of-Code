public class BasicStringManipulation {
    public static void main(String[] args) {
        String str = "Hello, this is a basic string manipulation example.";

        // Print the length of the string
        System.out.println("Length of the string: " + str.length());

        // Convert the string to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Convert the string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Check if the string contains a specific substring
        String searchStr = "basic";
        if (str.contains(searchStr)) {
            System.out.println("String contains '" + searchStr + "'");
        } else {
            System.out.println("String does not contain '" + searchStr + "'");
        }
    }
}
