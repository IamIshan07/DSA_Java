
public class PQ {

    public static void main(String[] args) {
        // Q2();
        Q3();

    }

    // Question 1 : What is the value of x^x for any value of x?

    /*
    Solution 1: The value of x^x = 0.
    Think about it, xor gives 0 when the bits are the same. If we compare the same number to
    itself, the bits will always be the same. So, the answer of x^x will always be 0.
     */
    // Question 2 : Swap two numbers without using any third variable.

    /*
    Solution 2: The idea is to use XOR operators to swap two numbers by their property
    x ^ x = 0
     */
    public static void Q2() {
        int a = 3, b = 4;
        System.out.println("Before swap: x = " + a + " and y = " + b);
        //swap using xor
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: x = " + a + " and y = " + b);

    }

    // Question 3 : Add 1 to an integer using Bit Manipulation.
    // (Hint : try using Bitwise NOT Operator)

    /*
    Solution 3 : The expression -~x will add 1 to an integer x. We know that to get negative of
    a number, invert its bits and add 1 to it (Remember negative numbers are stored in 2’s
    complement form), i.e.,
    -x = ~x + 1;
    -~x = x + 1 (by replacing x by ~x)
     */
    public static void Q3() {

        // int x = 6;
        // System.out.println(x + " + " + 1 + " is " + -~x);
        // x = -4;
        // System.out.println(x + " + " + 1 + " is " + -~x);
        // x = 0;
        // System.out.println(x + " + " + 1 + " is " + -~x);


        int n = 10;
        System.out.println("The answer is : "+(-(~n)));
    }


    // Question 4 : This question is based on a trick, please directly look at the solution.
    // Convert uppercase characters to lowercase using bits.

    /*
    Question 4 : It is a reading assignment for free time!
    */

}
