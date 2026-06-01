
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to enter ? : ");
        int num = sc.nextInt();
        int evensumm = 0, oddsum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter num " + i + " : ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evensumm += n;
            } else {
                oddsum += n;
            }

        }
        System.out.println("Sum of even numbers is : " + evensumm);
        System.out.println("Sum of odd numbers is : " + oddsum);
    }
}
