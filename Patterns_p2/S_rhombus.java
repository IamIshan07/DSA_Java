
import java.util.Scanner;

public class S_rhombus{
    public static void Rhombus(int TotalLines , int TotalStarsInLine) {
        for( int r = 1;r<= TotalLines ; r++){
            for(int cSpace = 1; cSpace <= TotalStarsInLine-r; cSpace++ ){
                System.out.print("  ");
            }
            for(int cStar = 1 ; cStar <= TotalStarsInLine;cStar++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you want to print : ");
        int TotalLines = sc.nextInt();
        System.out.print("Enter how many lines you want to print : ");
        int TotalStarsInLine = sc.nextInt();
        Rhombus(TotalLines,TotalStarsInLine);

    }
}