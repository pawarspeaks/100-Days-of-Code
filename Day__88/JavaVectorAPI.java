import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class BasicJavaVectorAPI {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};

        // Defining a vector species for integers
        VectorSpecies<Integer> species = IntVector.SPECIES_256;

        // Creating an integer vector using the species
        IntVector vector = IntVector.fromArray(species, data, 0);

        // Performing vector operations
        IntVector result = vector.mul(2).add(10);

        // Extracting the result to an array
        int[] resultArray = new int[data.length];
        result.intoArray(resultArray, 0);

        // Printing the original and modified arrays
        System.out.println("Original array: " + arrayToString(data));
        System.out.println("Modified array: " + arrayToString(resultArray));
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
