
import java.util.*;

public class primeL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");   
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n <= 1 ){
            isPrime = false;
        }else{
            // for(int d = 2 ; d * d <= n; d++){
            for(int d = 2 ; d <= Math.sqrt(n); d++){
                if(n % d == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n+" is a Prime number!!");
        }else{
            System.out.println(n+" is not a Prime number!!");
        }
    }
}
