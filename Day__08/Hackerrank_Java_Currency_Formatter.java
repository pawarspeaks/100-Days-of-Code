//Question link: https://www.hackerrank.com/challenges/java-currency-formatter

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US); 
        String us = nf.format(payment);
        
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);
        
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);

        Locale indiaLocale = new Locale("en","in"); //as_IN
        nf = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = nf.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
