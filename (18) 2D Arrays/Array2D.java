
import java.util.Scanner;

public class Array2D {

    public static boolean search(int[][] matrix, int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key is at cell : (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void elementInput(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element for (" + i + "," + j + ")th element : ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void print(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findLargest(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > largestElement) {
                    largestElement = matrix[i][j];
                }
            }
        }
        return largestElement;
    }

    public static void main(String args[]) {
        int[][] matrix = new int[3][3];
        elementInput(matrix);
        // search(matrix, 7);
        print(matrix);
        System.out.println("The largest element is : " + findLargest(matrix));

    }
}
