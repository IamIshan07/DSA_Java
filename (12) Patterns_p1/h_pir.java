
import java.util.Scanner;

public class h_pir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines you want to print : ");
        int line = sc.nextInt();
        for(int i = 1; i <= line ; i++){
            for(int num = 1; num <= i ; num ++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}