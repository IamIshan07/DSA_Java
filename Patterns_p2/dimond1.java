
// OWN...............................................
import java.util.Scanner;

public class dimond1{
    public static void Dimond(int TotalLines) {
        int counter = 1;
        // int counter2 = (2*(TotalLines-1))-1;       no need now !
        for(int r =1; r<= TotalLines;r++){
        // Space print
            for(int cSpace = 1 ;cSpace<=TotalLines-r;cSpace++){
                System.out.print("  ");
            }
        // Star print
            for(int cStar = 1; cStar<=counter;cStar++){
                System.out.print("* ");
            }
            counter+=2;
            System.out.println();
             
        }
        counter-=4;
        for(int r =TotalLines-1;r>=1;r--){
            // Space print
            for(int cSpace = 1 ;cSpace<=TotalLines-r;cSpace++){
                System.out.print("  ");
            }
        // Star print
            // for(int cStar = 1; cStar<=counter2;cStar++){
            for(int cStar = 1; cStar<=counter;cStar++){
                System.out.print("* ");
            }
            // counter2-=2;
            counter-=2;
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