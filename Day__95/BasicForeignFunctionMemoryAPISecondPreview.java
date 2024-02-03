import jdk.incubator.foreign.*;

public class BasicForeignFunctionMemoryAPISecondPreview {
    public static void main(String[] args) {
        // Allocating memory for an int
        MemorySegment memorySegment = CLinker.toCString(42);

        // Accessing the value in memory
        int value = memorySegment.getSegment(CLinker.C_INT).get();

        // Printing the value
        System.out.println("Value in Memory: " + value);
    }
}
