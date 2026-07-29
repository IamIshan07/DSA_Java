
import java.util.Scanner;


public class FloydT {

    public static void FloydsTringle(int lines) {
        int counter = 1;
        for(int r = 1 ; r<= lines;r++){
            for(int c =1 ; c<=r;c++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you want to print : ");
        int lines = sc.nextInt();
        FloydsTringle(lines);
    }
}
