
public class PowOptimized {

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimizedPower(x, n));
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = optimizedPower(x, n / 2);
        int halfPowSquare = halfPow * halfPow;

        if (n % 2 != 0) {
            return x * halfPowSquare;
        }

        return halfPowSquare;
    }
}
