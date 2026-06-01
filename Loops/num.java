
import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        for (; a > 0 ; a = a/10){
            int lastDigit = a%10 ;
            System.out.print(lastDigit);
        }
        System.out.println();
    }
}