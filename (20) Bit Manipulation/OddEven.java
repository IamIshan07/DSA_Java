
import java.util.Scanner;


public class OddEven {

    public static void main(String[] args) {
        System.out.print
        ("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddOrEven(n);
    }

    public static void oddOrEven(int n) {
        int bistMask = 1;
        if ((n & bistMask) == 0) {
            // even
            System.out.println("The number is even  .");
        }else{
            System.out.println("The number is odd .");
        }
    }
}
