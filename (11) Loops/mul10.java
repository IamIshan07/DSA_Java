import java.util.*;
public class mul10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Enter your number :");
            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }
            System.out.println("your num is :"+num);
        } while (true);
        // System.out.println("");
    }
}
