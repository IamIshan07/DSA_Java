import java.util.*;
public class D_while{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int counter = 1;
        System.out.println("Enter the range :");
        int n = sc.nextInt();
        System.out.println("......................................");
        do { 
            System.out.println("Hello World "+counter);
            counter++;
        } while (counter <= n);
    }
}