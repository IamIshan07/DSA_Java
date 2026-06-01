
import java.util.Scanner;
public class Q3 {

    public static boolean isPalindrome(int a) {
        if(a<0){
            return false;
        }else{

        int ReverseNum = 0;
        int aCopy = a;
        while (aCopy > 0) {
            int LD = aCopy % 10;
            ReverseNum = ((ReverseNum * 10) + LD);
            aCopy /= 10;
        }
        return a == ReverseNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        if (isPalindrome(a)) {
            System.out.print("The given number "+a+" is a Palindrome !!!!");
        } else {
            System.out.print("The given number "+a+" is not a Palindrome !!!!");
        }
    }
}
