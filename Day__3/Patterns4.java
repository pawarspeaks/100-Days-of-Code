//Nexted Loops Concept: Inverted Half pyramid
// ****
// ***
// **
// *


import java.util.* ;
public class Patterns4 {
        public static void main(String[] args) {
            int n = 4;
            //in this case of inerted half pyramid we just inverted the loop values and made it to i--
            //outer loop
            for (int i = n; i >= 1; i--) {
                //inner loop 
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }    
}
