import java.util.*;
public class DecToBi{
    public static int DecimalToBinary(int a){
        int binary = 0;
        int power = 0;
        while(a > 0){
            binary+= ((a%2)*(int)Math.pow(10, power));
            power++;    
            a/=2;

        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal value : ");
        int a = sc.nextInt();
        System.out.println("The binomial value of " + a + " is " + DecimalToBinary(a));
    }
}