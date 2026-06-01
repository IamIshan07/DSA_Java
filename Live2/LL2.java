import java.util.*;
public class LL2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vhow many linnes you want to print : ");
        int n = sc.nextInt();
        for(int r = 1; r<=n ;r++){
            for(int c = 1 ;c<= n; c++){
                if(c <= r){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}