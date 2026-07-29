import java.util.*;
public class star{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter how many lines you want to print : ");
        int lines = sc.nextInt();
        for(int l = 1; l <= lines; l++){
            for(int star = 1;star<=l;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}