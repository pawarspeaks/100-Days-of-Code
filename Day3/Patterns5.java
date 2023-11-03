//Nexted Loops Concept: Inverted Half pyramid (rotated  by 180 degrees)
//    *
//   **
//  ***
// ****

import java.util.*;

public class Patterns5 {
    public static void main(String[] args) {
         int n = 4;
        //outer loop
         for (int i = 1; i <= n; i++){
            //inner loop for printing spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
         }
    }
}