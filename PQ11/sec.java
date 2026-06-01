
import java.util.Scanner;

public class sec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddnsum = 0;
        do {
            System.out.print("Enter the number :");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddnsum += number;
            }
            System.out.println("Do you want to continue ? PRESS '1' for yes and PRESS ANY NUMBER for no!!");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers is :" + evensum);
        System.out.println("Sum of odd numbers is :" + oddnsum);

    }
}
