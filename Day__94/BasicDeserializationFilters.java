import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BasicDeserializationFilters {
    public static void main(String[] args) {
        // Creating a list of objects to serialize
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Serialization");
        stringList.add("Filters");

        // Serializing the list to a byte array
        byte[] serializedData = serializeData(stringList);

        // Deserializing the data with a custom filter
        List<String> deserializedList = deserializeData(serializedData);

        // Printing the deserialized list
        System.out.println("Deserialized List: " + deserializedList);
    }

    private static byte[] serializeData(List<String> data) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {

            objectOutputStream.writeObject(data);
            return byteArrayOutputStream.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static List<String> deserializeData(byte[] serializedData) {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedData);
             ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {

            // Applying a deserialization filter to only allow Strings
            objectInputStream.setObjectInputFilter(
                    (info -> info.serialClass() == null || info.serialClass() == String.class));

            return (List<String>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
