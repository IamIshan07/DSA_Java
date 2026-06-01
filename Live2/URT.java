import java.util.*;

public class URT{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you want to print : " );
        int line = sc.nextInt();
        for(int r =1;r<=line;r++){
            for (int c = 1 ;c <= line ;c++) {
                if(r-c <=0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}