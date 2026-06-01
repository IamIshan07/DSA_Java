
import java.util.Scanner;
public class Q5 {

    public static int Dsum(int a) {
        int sum = 0 ;
        while(a >0){
            int LD = a % 10;
            sum += LD;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        System.out.println("sum of the digits in an integer is : "+Dsum(a));

    }
}
