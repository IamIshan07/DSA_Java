
import java.util.Scanner;

public class factorial{
    public static int Factorial(int a){
        int factorial = 1;
        for (int i = 1; i <= a; i++){
            factorial*= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        // int factorial = factorial(num);
        // System.out.println("Factorial of "+num+" is "+factorial);
        System.out.println("Factorial of "+num+" is : "+Factorial(num));
    }
}