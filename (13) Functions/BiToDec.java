
import java.util.*;

public class BiToDec {

    public static int BinaryToDecimal(int a) {
        int decimal = 0;
        int power = 0;
        while (a > 0) {
            int LD = a % 10;
            decimal += (LD * (int) Math.pow(2, power));
            power++;
            a /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary value : ");
        int a = sc.nextInt();
        System.out.println("The decimal value of " + a + " is " + BinaryToDecimal(a));
    }
}
