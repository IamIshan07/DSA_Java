
import java.util.Scanner;

public class iThBitOperations {

    public static void main(String[] args) {
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter which index bit you want to know : :");
        int i = sc.nextInt();
        // System.out.println("the bit's value is " + getIthBit(n, i));
        // System.out.println("The result of set i'th bit is :" + setIthBit(n, i));
        // System.out.println("The result of set i'th bit is :" + clearIthBit(n, i));

        // System.out.print("Enter the bit value :");
        // int newBit = sc.nextInt();
        // // System.out.println("The result of set i'th bit is :" + updateIthBit1(n, i, newBit));
        // System.out.println("The result of set i'th bit is :" + updateIthBit2(n, i, newBit));
        System.out.println("After last i bits cleareds , the number is :" + clearLastIBits(n, i));

    }

    public static int getIthBit(int number, int i) {
        int bitMask = 1 << i;
        if ((number & bitMask) == 0) {
            return 0;

        } else {
            return 1;
        }
    }

    public static int setIthBit(int number, int i) {
        int bitMask = 1 << i;
        return (number | bitMask);
    }

    public static int clearIthBit(int number, int i) {
        int bitMask = ~(1 << i);
        return (number & bitMask);
    }

    public static int updateIthBit1(int number, int i, int newBit) {
        if (newBit == 0) {
            //clear
            // return (number & (~(1<<i)));
            return clearIthBit(number, i);
        } else {
            // set
            // return ((number | 1 << i));
            return setIthBit(number, i);
        }
    }

    public static int updateIthBit2(int number, int i, int newBit) {
        clearIthBit(number, i);
        int bitMask = newBit << i;
        return number | bitMask;
    }

    public static int clearLastIBits(int number, int i) {
        int bitMask = (~0) << i;

        return number & bitMask;
    }

}
