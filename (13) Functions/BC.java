
import java.util.*;

public class BC {

    public static int Factorial(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static int BC(int n, int r){
        int Fn = Factorial(n);
        int Fr = Factorial(r);
        int Fnr = Factorial(n-r);
        int BC = (Fn/(Fr*Fnr));
        return BC;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        // int BinomialC = (Factorial(n) / (Factorial(r) * Factorial(n - r)));
        // System.out.println("Binomial Coefficient is : "+BinomialC);

        System.out.println("Binomial Coefficient is : "+BC(n, r));
    }
}
