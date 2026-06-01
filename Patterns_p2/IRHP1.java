
import java.util.Scanner;


public class IRHP1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter how many lines you want to print : ");
            int TotalRows = sc.nextInt();
            for(int r = 1; r<=TotalRows;r++){
                for(int c = 1; c<= TotalRows; c++){
                    if(r+c>TotalRows){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
}