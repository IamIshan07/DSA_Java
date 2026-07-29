
import java.util.Scanner;

public class p_one {
    public static void main(String[] args) {
       int counter = 1;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter how long you want to print : ");
       int n = sc.nextInt();
       System.out.println("-----------------------");
       while(counter <= n){
        System.out.print(counter+" ");
        counter++;
       }
       System.out.println("\nHere are the numbers 1 to "+n+" printed on the screen.");
    }
} 