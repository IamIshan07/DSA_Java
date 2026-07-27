public class key1 {
    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        int key = 27;
        findKey(key, arr);
    }

    public static boolean findKey(int key, int[][] arr){
        int m = arr.length, n = arr[0].length;
        int row = 0, col = n-1;
        while (row<m && col >= 0){
            if(arr[row][col] == key){
                System.out.println("The key is on the index : " + row + "," + col);
                return true;
            }else if(key > arr[row][col]){
                row++;
            }else{
                col--;
            }
        }

        System.out.println("Key not found !");
        return false;
    }
}
