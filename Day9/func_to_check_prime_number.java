import java.util.*;
public class func_to_check_prime_number {
    public static boolean PrimeChecker (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        // if a nnumber is not divisible by any other number except itself and is not equals to or less than 1 then its a prime number
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbertocheck = sc.nextInt();
        if (PrimeChecker(numbertocheck)) {
            System.out.println(numbertocheck + " is a prime number");
        }
        else {
            System.out.println(numbertocheck + " is not a prime number");
        }

    }
}


