
import java.util.*;

public class range {

    public static boolean isPrime(int m) {
        if (m <= 1) {
            return false;
        }
        if (m == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int m, int n) {
        while(m<=n){
            if(isPrime(m)){
                System.out.print(m +" ");
            }
            m++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting value of the range : ");
        int m = sc.nextInt();
        System.out.print("Enter the Ending value of the range : ");
        int n = sc.nextInt();
        System.out.print("The prime numbers are : ");
        PrimeInRange(m, n);


    }
}
