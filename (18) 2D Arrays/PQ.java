
public class PQ {

    public static void main(String[] args) {
        int[][] arr = {{4, 7, 8}, {8, 8, 7}};
        int key = 7;
        // System.out.println("7's count is :" + question1(arr, key));

        int[][] nums = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        // question2(nums);

        String[][] arr2 = {{"a11", " a12 ", "a13"}, {"a21", "a22", "a23"}};
        // question3a(arr2);
        question3bPrint(question3b(nums));
    }

    /*

        Question 1 : Print the number of 7’s that are in the 2d array.
        Example :
        Input - int[][] array = { {4,7,8},{8,8,7} };
        Output - 2

     */
    public static int question1(int[][] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }

        return count;
    }


    /*

        Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
        Example :
        Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        Output - 18
    
     */
    public static void question2(int[][] arr) {
        int row = 1;
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[row][i];
        }
        System.out.println("The sum of the 2nd array is " + sum);
    }


    /*
       
    
        Question 3 : Write a program to Find Transpose of a Matrix.
        What is Transpose?
        Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,

        Matrix
        a11 a12 a13
        a21 a22 a23
        
        Transposed Matrix
        a11 a21
        a12 a22
        a13 a23

    
     */
    public static void question3a(String[][] arr) {
        int SR = 0, ER = arr.length, SC = 0, EC = arr[0].length;
        while (SC < EC) {
            for (int i = SR; i < ER; i++) {
                System.out.print(arr[i][SC] + " ");
            }
            System.out.println();
            SC++;
        }
    } 

    public static int[][] question3b(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] newArr = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    newArr[j][i] = arr[i][j];
                }else{
                    newArr[i][j] = arr[i][j];
                }
            }
        }
        // for (int i = 0; i < newArr.length; i++) {
        //     for (int j = 0; j < newArr[0].length; j++) {
        //         System.out.print(newArr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        return newArr;
    }

    public static void question3bPrint(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
