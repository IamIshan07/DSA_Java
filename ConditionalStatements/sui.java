
import java.util.*;

public class sui {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // char ch = sc.next().charAt(0);
        // switch (ch) {
        switch (number) {
            case 1:
                System.out.println("I want - mango");
                break;
            case 2:
                System.out.println("I want - guava");
                break;
            case 3:
                System.out.println("I want - apple");
                break;
            // case 'a':
            //     System.out.println("I want - pineapple");
            //     break;
            default:
                System.out.println("I want - nothing");
        }

    }
}
