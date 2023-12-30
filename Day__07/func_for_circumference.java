import java.util.Scanner;

public class func_for_circumference {
    public static Double getCircumference (Double radius) {
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(getCircumference(radius));   
    }
}
