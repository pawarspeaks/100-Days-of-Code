import java.util.*;

public class inputfromuser {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        //here in the above line 'next only print the first word i.e token of the inputted string'
        String name = sc.nextLine();
        //nextLine prints the whole string that is inputted.
        //nextInt();
        //nextFloat(); 
        System.out.println(name);
    }
}
