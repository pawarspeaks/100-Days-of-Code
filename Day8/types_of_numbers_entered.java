import java.util.*;

public class types_of_numbers_entered {
    public static void main(String[] args) {
        int poitive = 0, negative = 0, zeros = 0;
        System.out.println("Enter 1 to continue and 0 to exit: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        

        while (input == 1) {
            System.out.println("Enter your number: ");
            int number = sc.nextInt();
            if (number > 0) {
                poitive++;
            }
            else if(number < 0) {
                negative++;
            }
            else {
                zeros++;
            }
            System.out.println("Enter 1 to continue and 0 to exit: ");
            input = sc.nextInt();//input in loop to continue taking in the inputs from the user
        }
        System.out.println("Positives: " + poitive);
        System.out.println("Negatives: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}