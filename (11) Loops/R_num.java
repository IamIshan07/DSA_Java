import java.util.*;
public class R_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n = sc.nextInt();
        int sum = 0;
        int rev = 0;
        while(n > 0){
            int lastDigit = n % 10;
            rev = ((rev * 10)+lastDigit);
            n = n/10;
        }
        System.out.println("The reverse of the given number is : "+rev);
    }
}