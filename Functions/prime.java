
import java.util.Scanner;

public class prime {

    public static boolean isPrime(int a) {
        // boolean isPrime = true;
        if(a <= 1 ){
            return false;
        }
            
        if(a == 2){
            return true;
        }

        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a % i == 0) 
                return false;
            
            
        
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();
        // boolean check = isPrime(a);
        if (isPrime(a) == true) {
            System.out.println("Your number is a prime number !!");
        } else {
            System.out.println("Your number is not a prime number !!");
        }
    }
}

