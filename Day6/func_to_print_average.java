
import java.util.*;

public class func_to_print_average {
    public static int calculateAverage (int a, int b, int c) {
     int average1 = (a + b + c);
     int average = (average1)/3;
     return average;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = calculateAverage(a, b, c);
        System.out.println("average of the inputted numbers is : " + average);
    }
}