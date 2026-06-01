import java.util.*;

public class Q2{
    public static boolean isEven(int a){
    // ....................................
        // if(a % 2 == 0){
        //  return true;   
        // }                  both are same but the below mentioned is more efficient 
    //                   and less step , means little work!!! so that is more recomended
        // return false;
    // ...........................
        return a % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a number : ");
        int a = sc.nextInt();
        System.out.print("Your number is even : "+isEven(a));
    }
}