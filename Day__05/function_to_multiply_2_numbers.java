import java.util.*;

public class function_to_multiply_2_numbers {
    
    public static int calculateproduct (int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateproduct(a, b);
        System.out.println("product of given two numbers is:" + product);
    }   
}
