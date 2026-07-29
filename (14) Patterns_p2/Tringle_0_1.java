
import java.util.Scanner;

public class Tringle_0_1{
    public static void Tringle_0_1(int TotalLines) {
        int a = 0;
        int b = 1;
        for(int r = 1 ; r <= TotalLines;r++ ){
            for(int c = 1 ; c <= r; c++){
                if((r+c) % 2 == 0){
                    System.out.print(b+" ");
                }else{
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you want to print : ");
        int TotalLines = sc.nextInt();
        Tringle_0_1(TotalLines);
    }
}