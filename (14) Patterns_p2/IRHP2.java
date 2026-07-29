
import java.util.Scanner;

public class IRHP2{
    public static void InvertedRoatedHalfPyramid(int TotalLines){
        for(int r = 1 ; r<=TotalLines;r++){
            for(int cSpace = 1 ; cSpace <= TotalLines-r; cSpace++){
                System.out.print("  ");
            }
            for(int cStar = 1 ; cStar <= r; cStar++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you want to print : ");
        int TotalLines = sc.nextInt();
        System.out.println("Here is your Structure : ");
        InvertedRoatedHalfPyramid(TotalLines);
    }
}