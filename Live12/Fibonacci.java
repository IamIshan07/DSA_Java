
public class Fibonacci {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findInFibonacci(n));;
    }

    public static int findInFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return findInFibonacci(n - 1) + findInFibonacci(n - 2);
    }
}
