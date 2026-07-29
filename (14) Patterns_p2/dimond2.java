
import java.util.Scanner;

public class dimond2{
    public static void Dimond(int TotalLines) {
        for (int r = 1; r <= TotalLines; r++) {
            for (int cSpace = 0; cSpace < TotalLines-r; cSpace++) {
                System.out.print("  ");
            }
            for (int rStar = 0; rStar < ((2*r)-1); rStar++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int r = TotalLines-1; r >= 1; r--) {
            for (int cSpace = 0; cSpace < TotalLines-r; cSpace++) {
                System.out.print("  ");
            }
            for (int rStar = 0; rStar < ((2*r)-1); rStar++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you want to print : ");
        int lines = sc.nextInt();
        Dimond(lines);
    }
}