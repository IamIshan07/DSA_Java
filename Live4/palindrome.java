
import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        } else {

            String str = Integer.toString(n);
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        if (isPalindrome(a)) {
            System.out.print("The given number " + a + " is a Palindrome !!!!");
        } else {
            System.out.print("The given number " + a + " is not a Palindrome !!!!");
        }
    }
}
