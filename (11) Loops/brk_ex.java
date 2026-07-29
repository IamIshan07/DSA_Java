
import java.util.*;

public class brk_ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number :");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println("Your number is: " + num);
        } while (true);
        System.out.println("Opps you entered 10's multiply!!!! .... now this printing process is stopped!!!...");
    }
}