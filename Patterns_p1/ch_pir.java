
import java.util.Scanner;

// public class ch_pir{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter how many lines you want to print :");
//         int line = sc.nextInt();
//         char ch = 'A';
//         for(int i = 1 ; i <= line ;i++){
//             for(int chars=1; chars<=i;chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.err.println();
//         }
//     }
// }




public class ch_pir{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr how many line you want to print : ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int r = 1 ;r<=n ; r++){
            for(int c = 1; c <= n ; c++){
                if(r-c >= 0){
                    System.out.print(ch+" ");
                    ch++;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}