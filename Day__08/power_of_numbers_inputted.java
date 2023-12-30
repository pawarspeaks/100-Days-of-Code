import java.util.Scanner;

public class power_of_numbers_inputted {
    public static void main(String[] args) {
        System.out.println("Enter the value of X: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int result = 1;
        for (int i=1; i<=n; i++)
        //here above if we take the i=0 we'll need to make the i<n to make run exactly n times
         {
            result = result * x;//this will continue to multiply the multiplicants until the given n to achieve the final result
        }
        System.out.println("The value of " + x + " to the power " + n + " is: " + result);
    }
}
