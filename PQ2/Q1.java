import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int ave = ((A + B + C) / 3);
        System.out.println("The average of 3 numbers is : "+ ave);
    }
}