
import java.util.*;

public class fac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 1;
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if (n == 1 || n == 0) {
            System.out.println("Factorial of " + n + " is : 1");
        } else {
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println("Factorial of " + n + " is " + f);
        }
    }
}
