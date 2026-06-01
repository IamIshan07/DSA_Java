
import java.util.*;

public class cal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which operation you want to perform : ");
        char operation = sc.next().charAt(0);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        switch (operation) {
            case '+':
                System.out.println("Sum is : " + (a + b));
                break;
            case '-':
                System.out.println("minus is : " + (a - b));
                break;
            case '*':
                System.out.println("multiplication is : " + (a * b));
                break;
            case '/':
                System.out.println("divition is : " + (a / b));
                break;
            case '%':
                System.out.println("remainder is : " + (a % b));
                break;
            default:
                System.out.println("calculation not possible");
        }

    }
}
