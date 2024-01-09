import java.util.HashMap;

public class BasicHashMapOperations {
    public static void main(String[] args) {
        // Creating a HashMap of countries and their capitals
        HashMap<String, String> countryCapitals = new HashMap<>();

        // Adding key-value pairs to the HashMap
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("UK", "London");
        countryCapitals.put("Japan", "Tokyo");

        // Printing the original HashMap
        System.out.println("Original HashMap: " + countryCapitals);

        // Adding a new key-value pair to the HashMap
        countryCapitals.put("Australia", "Canberra");
        System.out.println("HashMap after adding a pair: " + countryCapitals);

        // Removing a key-value pair from the HashMap
        countryCapitals.remove("UK");
        System.out.println("HashMap after removing a pair: " + countryCapitals);

        // Accessing value by key
        String capitalOfIndia = countryCapitals.get("India");
        System.out.println("Capital of India: " + capitalOfIndia);

        // Finding the number of key-value pairs in the HashMap
        int mapSize = countryCapitals.size();
        System.out.println("Size of the HashMap: " + mapSize);

        // Checking if the HashMap contains a specific key
        boolean containsKey = countryCapitals.containsKey("Japan");
        System.out.println("Does HashMap contain Japan? " + containsKey);
    }
}
