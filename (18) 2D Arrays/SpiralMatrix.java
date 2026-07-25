
import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter row length :");
        // int n = sc.nextInt();
        // System.out.print("Enter column length :");
        // int m = sc.nextInt();
        // int[][] arr = new int[n][m];
        int[][] arr2 = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        // arrayInput(arr);
        // printMatrix(arr);
        spiralMatrix(arr2);
    }

    public static void arrayInput(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element for (" + i + "," + j + ")th element : ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiralMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int startingRow = 0;
        int startingColumn = 0;
        int endingRow = n - 1;
        int endingColumn = m - 1;
        while (startingColumn <= endingColumn && startingRow <= endingRow) {
            // Top
            for (int j = startingColumn; j <= endingColumn; j++) {
                System.out.print(arr[startingRow][j]+" ");
            }
            // Right
            for (int i = startingRow+1; i <= endingRow; i++) {
                System.out.print(arr[i][endingColumn]+" ");
            }
            // Bottom
            for (int j = endingColumn-1; j >= startingColumn; j--) {
                if(startingRow == endingRow){
                    break;
                }
                System.out.print(arr[endingRow][j]+" ");
            }
            // Left
            for (int i = endingRow-1; i > startingRow; i--) {
                if(startingColumn == endingColumn){
                    break;
                }
                System.out.print(arr[i][startingColumn]+" ");
            }

            startingColumn++;
            endingColumn--;
            startingRow++;
            endingRow--;
        }
    }
}
