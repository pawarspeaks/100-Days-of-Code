import java.util.*;

public class func_for_larger_number {
    public static int compareNumbers (int a, int b) {
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = compareNumbers(a,b);
        System.out.println("The greatest number between given numbers is :" + result);
    }    
}
