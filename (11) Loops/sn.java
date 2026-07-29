
import java.util.Scanner;

public class sn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= range ){
            // sum = sum+counter;
            sum+=counter;
            counter ++;
            
        }
        System.out.println("The factorial / sum of 1st natural number is : ");
        System.out.println(sum);

    }
}