
import java.util.Arrays;
import java.util.Scanner;

public class PQ {

    public static void main(String[] args) {
        // String str = "Hey i am ishan kar.";
        // String str = "aeiougfgfgfgfgfi";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine();
        // String str = new Scanner(System.in).nextLine();   /*-------------- don't know*/
        System.out.println("Total count lower case vowels is : " + lowercaseVowelCount(str));
        PQ3();
        if (isAnagrams()) {
            System.out.println("both strings are Anagrams");
        } else {
            System.out.println("both strings are not Anagrams");
        }
        StrBuffer();
    }

//Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.
    public static int lowercaseVowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void PQ3() {

        String str = "ApnaCollege".replace("l", "");
        String name = "Ishan Kar".replace("shan", "man");
        String three = "Ishan345235".replaceAll("\\d", "*");

        /*
        
         --------------Common Regex Patterns-------------------
            "\\d"	    Any digit	5, 9
            "\\D"	    Any non-digit	A, #
            "\\s"	    Any whitespace	" "
            "\\S"	    Any non-whitespace	a, 1
            "."	        Any single character	a, 5, @
            "[abc]"	    a or b or c	a
            "[0-9]"	    Any digit	7
            "[A-Z]"	    Any uppercase letter	M
            "[a-z]"	    Any lowercase letter	k
        
         */
        String four = "Ishan345235".replaceFirst("\\d", ".");

        System.out.println(str);
        System.out.println(name);
        System.out.println(three);
        System.out.println(four);

    }

    /*

Question 4 : Determine if 2 Strings are anagrams of each other.
What are anagrams?

If two strings contain the same characters but in a different order, they can be said to be
anagrams. Consider race and care. In this case, race's characters can be formed into a study,
or care's characters can be formed into race. Below is a java program to check if two strings
are anagrams or not. 

     */
    public static boolean isAnagrams() {
        String str1 = "race";
        String str2 = "care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        // boolean result = Arrays.equals(str1Arr, str2Arr);
        // return result;
        return Arrays.equals(str1Arr, str2Arr);
    }

    /*
    
    Question 5 : Search and read about
    a. intern( ) method in String
    b. StringBuffer
    
     */
    //a.     intern() is confusing now..... learn OOPs then learn it.
    /*b.     StringBuffer supports support methods like:
                append()      // Adds text
                insert()      // Inserts text
                delete()      // Removes characters
                replace()     // Replaces characters
                reverse()     // Reverses the string
                length()      // Returns length
                charAt()      // Returns character at index

     */
    public static void StrBuffer() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");

        System.out.println(sb);
        System.out.println(sf);
    }

}
