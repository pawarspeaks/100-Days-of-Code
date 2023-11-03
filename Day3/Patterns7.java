//Nexted Loops Concept: Inverted half pyramid with Numbers
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

import java.util.*;
public class Patterns7 {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j<= n-i+1;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
