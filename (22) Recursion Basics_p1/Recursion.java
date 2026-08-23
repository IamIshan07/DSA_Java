
public class Recursion {

    public static void main(String[] args) {
        int a = 10;
        printDecrising(a);

    }

    public static void printDecrising(int a) {
        if (a == 1) {
            System.out.print(a);
            return;
        }
        System.out.print(a + " ");
        printDecrising(a - 1);
    }
}



// public class Recursion {

//     public static void main(String[] args) {
//         int a = 1;
//         printDecrising(a);

//     }

//     public static void printDecrising(int a) {
//         if (a == 20) {
//             System.out.print(a);
//             return;
//         }
//         System.out.print(a + " ");
//         printDecrising(a + 1);
//     }
// }
