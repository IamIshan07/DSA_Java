import java.util.*;

public class HR{
    public static void HolloRectangle(int totalRows , int totalColumns){
        for(int r = 1; r<=totalRows;r++){
            for(int c = 1 ; c<=totalColumns; c++){
                if(r == 1|| r == totalRows || c == 1|| c == totalColumns){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr how many line/rows you want to print : ");
        int r = sc.nextInt();
        System.out.print("Enetr how many columns you want to print : ");
        int c = sc.nextInt();
        HolloRectangle(r, c);
    }
}