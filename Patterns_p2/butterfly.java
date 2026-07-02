
import java.util.Scanner;

public class butterfly {

    public static void ButterflyPattern(int TotalLines) {
        for (int r = 1; r <= TotalLines; r++) {
            // for printing star = i number
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            // for printing space 2 * (TotalLines - r)
            for (int c = 1; c <= (2 * (TotalLines - r)); c++) {
                System.out.print("  ");
            }

            // for printing star = i number
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int r = TotalLines - 1; r >= 1; r--) {
            // for printing star = i number
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            // for printing space 2 * (TotalLines - r)
            for (int c = 1; c <= (2 * (TotalLines - r)); c++) {
                System.out.print("  ");
            }
            // for printing star = i number
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you want to print : ");
        int lines = sc.nextInt();
        ButterflyPattern(lines);
    }
}
