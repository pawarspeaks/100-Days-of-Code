////Nexted Loops Concept: Half pyramid
// *
// **
// ***
// ****

import java.util.* ;
public class Patterns3 {
        public static void main(String[] args) {
            int n = 4;

            //outer loop
            for (int i = 1; i <= n; i++) {
                //inner loop
                // here took j less than equal to i becaus here number of star per row = row number 
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }   
}
