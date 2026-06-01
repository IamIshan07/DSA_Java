// import java.util.*;

// public class Q1 {

//     public static int average(int a, int b, int c) {
//         int ave = ((a + b + c) / 3);
//         return ave;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter b : ");
//         int b = sc.nextInt();
//         System.out.print("Enter c : ");
//         int c = sc.nextInt();
//         System.out.println("Average of 3 numbers is : "+average(a, b, c));
//     }
// }



// this is a self tried advance averageb programme!!./..........

import java.util.*;

public class Q1{
    public static float average(float total,float numc){
        if (numc == 0){
            return 0;
        }
        return total / numc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to use : ");
        int numC = sc.nextInt();
        int total = 0;
        for(int i =1;i<=numC;i++){
            System.out.print("Enter your number "+ i +" : ");
            int a = sc.nextInt();
            total += a;
            
        }
        System.out.print("The average of given numbers are : "+average(total, numC));

    } 
}