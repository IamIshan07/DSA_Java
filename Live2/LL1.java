
import java.util.Scanner;

public class LL1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many line you want to print : ");
        int n = sc.nextInt();
        for(int r = 1;r<=n;r++){
            for(int c = 1; c<=r ;c++){
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}