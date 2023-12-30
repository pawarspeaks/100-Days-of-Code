import java.util.Scanner;

public class GCD_of_2_numbers {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();


       while(a != b) { 
        if(a>b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }
    System.out.println("GCD is : "+ b);
    }   

}
