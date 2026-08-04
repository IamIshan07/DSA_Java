
public class PowerOf2 {

    public static void main(String[] args) {
        int n = 17;
        if (isNumberIsPowerOf2(n)) {
            System.out.println("The number is a power of 2!");
        } else {
            System.out.println("The number is not a power of 2!");
        }
    }

    public static boolean isNumberIsPowerOf2(int n) {

        return ((n & (n - 1)) == 0);
    }
}
