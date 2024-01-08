import java.util.ArrayList;

public class BasicArrayListOperations {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Printing the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Adding an element at a specific index
        numbers.add(2, 25);
        System.out.println("ArrayList after adding element at index 2: " + numbers);

        // Removing an element at a specific index
        numbers.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + numbers);

        // Accessing an element by index
        int element = numbers.get(1);
        System.out.println("Element at index 1: " + element);

        // Finding the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);
    }
}
