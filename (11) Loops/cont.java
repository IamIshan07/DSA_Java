import java.util.*;
public class cont{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range :");
        int range = sc.nextInt();
        System.out.println("................................");
        for(int i = 1;i<=range;i++){
            if(i == 3){
            continue;
            }
            System.out.println(i);
        }
    }
}
