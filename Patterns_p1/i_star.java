import java.util.*;

public class i_star{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many line you want : ");
        int line = sc.nextInt();
        for(int l=1; l<=line ;l++){
            for(int star = 1;star<=line-l+1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}