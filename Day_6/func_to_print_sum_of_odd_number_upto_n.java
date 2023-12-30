import java.util.*;

public class func_to_print_sum_of_odd_number_upto_n {
    public static int calculateSum (int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {
                sum += 1;
            }
        }
        return sum;
    }    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int sum = calculateSum(a);
          System.out.println("The sum of odd number upto the given number is : " + sum);

        }    
}
