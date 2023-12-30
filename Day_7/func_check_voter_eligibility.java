import java.util.*;

public class func_check_voter_eligibility {
    public static boolean getVoterEligibilty (int age) {
        if (age > 18) {
            return true;
        } 
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.err.println(getVoterEligibilty(age));
    }   
}
