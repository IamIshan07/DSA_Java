
import java.util.Scanner;

public class H_rhombus {

    public static void HollowRhombus(int TotalLines, int TotalStarsInLine) {
        for (int r = 1; r <= TotalLines; r++) {
            for (int cSpace = 1; cSpace <= TotalLines - r; cSpace++) {
                System.out.print("  ");
            }
            for (int cStar = 1; cStar <= TotalStarsInLine; cStar++) {
                if (r == 1 || r == TotalLines || cStar == 1 || cStar == TotalStarsInLine) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you wabnt to print : ");
        int TotalLines = sc.nextInt();
        System.out.print("Enter how many stars in lines you wabnt to print : ");
        int TotalStarsInLine = sc.nextInt();
        HollowRhombus(TotalLines, TotalStarsInLine);

    }
}
