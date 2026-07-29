
import java.util.*;

public class whi {

    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to print : ");
        int n = sc.nextInt();
        while (counter < n) {
            System.out.println("Hello world");
            counter++;
        }
        System.out.println(n + " times prined successfully!!");
    }
}
