
import java.util.Scanner;

public class s_params{
    public static int calculateSum(int num1,int num2){ // here num1 and num2 are parameters or formal parameters!!
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // here a and b are - arguments or actual parameters!!
        System.out.println("Sum of a and b is : "+sum);
    }
}