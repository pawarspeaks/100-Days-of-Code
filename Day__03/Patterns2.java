//Nexted Loops Concept: Hollow Rectangle
// *****
// *   *
// *   *
// *****

import java.util.*;

public class Patterns2 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        //outer loop rows
        for (int i = 1;i <= n; i++){
            //inner loop columns
            for (int j = 1;j <= m; j++) {
                //cell -> (i,j)
                // '||' is used to determine conditions 'and' if any one of the conditions is satisfied for any value of j the statement below will be printed!!!
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");;
                }
            }
            System.out.println();
        }
    
    }
}
