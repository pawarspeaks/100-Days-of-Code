import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // Counter++ = counter = counter + 1 
        // This is known as the increment operator in Java
        // For loop syntax format is as follows: for (initialization; condition; updation) {}
       
        // for (int counter = 0; counter < 11; counter++) {
        //     System.out.print(counter + " "); // Add a space after each number
        // }


        //  for (int i = 0; i < 11; i++) {
        //      System.out.print(i + "  "); 
        //  }


        // int i = 0;
        // while (i<11){
        //     System.out.println(i);
        //     i++;
        // }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<11);
    }    
}
