import java.util.*;

public class LocalVariableTypeInferenceAdvancedDemo {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            var element = iterator.next();
            System.out.println("Element: " + element);
        }
    }
}
