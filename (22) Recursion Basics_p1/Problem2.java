
public class Problem2 {

    public static void main(String[] args) {
        int n = 15;
        printIncreasing(n);

    }

    public static void printIncreasing(int a) {
        if (a == 1) {
            System.out.print(a + " ");
            return;
        }
        printIncreasing(a - 1);
        System.out.print(a + " ");
    }
}
