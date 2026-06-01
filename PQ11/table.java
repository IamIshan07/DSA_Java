import java.util.*;
public class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans;
        System.out.print("Enter Your number : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            ans = n * i;
            System.out.println(n+" * "+i+" = "+ans);
        }
    }
}