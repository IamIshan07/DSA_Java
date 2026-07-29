
public class Palindrome {

    public static void main(String[] args) {
        String str = "NOONO";
        // int SI = 0;
        // int EI = str.length() - 1;
        // boolean isPalindrome = true;
        // // IT WILL BE SMALLER TO WRITE IF WE WRITE IT AS A FOR LOOP
        // while (SI < EI) {
        //     if (str.charAt(SI) != str.charAt(EI)) {
        //         isPalindrome = false;
        //         break;
        //     }
        //     SI++;
        //     EI--;
        // }
        // if (isPalindrome) {
        //     System.out.println("It is a palindrome!!");
        // } else {
        //     System.out.println("It is not a palindrome!!");
        // }

        System.err.println("The string is palidrome is :"+pali(str));
    }
    public static boolean pali(String str) {
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
