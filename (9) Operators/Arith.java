
import java.util.Scanner;

public class Arith{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.err.println("Sum of a and b is : "+(a + b));
        System.err.println("substraction of a and b is : "+(a - b));
        System.err.println("multiplication of a and b is : "+(a * b));
        System.err.println("divition of a and b is : "+(a / b));
        System.err.println("modulo of a and b is : "+(a % b));


// UnaryOperator
// pre post increment 

        int x = sc.nextInt();
        int m = sc.nextInt();
        int y = ++x;
        int z = m++;
        System.err.println("value of x is "+x);
        System.err.println("value of m is "+m);
        System.err.println("value of pre increment (y) is : "+y);
        System.err.println("value of post increment (z) is : "+z);
    }
}