import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingWithJava {
    public static void main(String[] args) {
        String filePath = "sample.txt"; //path to the file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
