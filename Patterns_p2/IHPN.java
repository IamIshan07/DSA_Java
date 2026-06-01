
// import java.util.Scanner;
// public class IHPN{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter how many lines you want to print : "); 
//        int TotalLines = sc.nextInt();
//        Inverted_Half_Pyramid_With_Numbers(TotalLines);
//     }
//     public static void Inverted_Half_Pyramid_With_Numbers(int TotalLines){
//             for (int r = 1; r <= TotalLines; r++) {
//                 for(int c = 1 ; c<= TotalLines ;c++){
//                     if (r+c <= TotalLines+1) {
//                         System.out.print(c+" ");
//                     } else {
//                         System.out.print("  ");
//                     }
//                 }
//                 System.out.println();
//             }
//     }
// }
import java.util.Scanner;

public class IHPN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines you want to print : ");
        int TotalLines = sc.nextInt();
        Inverted_Half_Pyramid_With_Numbers(TotalLines);
    }

    public static void Inverted_Half_Pyramid_With_Numbers(int TotalLines) {
        for (int r = 0; r < TotalLines; r++) {
            for (int cNum = 1; cNum <= TotalLines - r; cNum++) {
                System.out.print(cNum+" ");
            }
            System.out.println();
        }
    }

}
// import java.util.Scanner;

// public class IHPN {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter how many lines you want to print : ");
//         int TotalLines = sc.nextInt();
//         Inverted_Half_Pyramid_With_Numbers(TotalLines);
//     }

//     public static void Inverted_Half_Pyramid_With_Numbers(int TotalLines) {
//         for (int r = 1; r <= TotalLines; r++) {
//             for (int cNum = 1; cNum <= ((TotalLines+1) - r); cNum++) {
//                 System.out.print(cNum+" ");
//             }
//             System.out.println();
//         }
//     }

// }
