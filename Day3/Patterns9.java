//Nexted Loops Concept: 0-1 Triangle
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// // 1 0 1 0 1
// in the above 0-1 triangle after observing properly we can figure out that the even cell numbers have 1 and the odd cell numbers have 0 over there 

import java.util.*;
public class Patterns9 {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                }
                else //odd {
                    System.out.print("0 ");
                }
                System.out.println();
            }
        }
    }    
