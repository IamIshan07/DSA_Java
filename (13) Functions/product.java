
import java.util.Scanner;

public class product {

    public static int Multiplyer(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        int product = Multiplyer(a, b);
        System.out.println("Product is : " + product);
        product = Multiplyer(3, 6);
        System.out.println(product);
    }
}
