public class Key2 {
    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        int key = 40;
        keyFind(key, arr);
    }
    public static boolean keyFind(int key,int[][] arr){
        int m = arr.length, n = arr[0].length;
        int row = m-1, col = 0;

        while (row>=0 && col<n){
            if(arr[row][col] == key){
                System.out.println("The key is on the index : " + row + "," + col);
                return true;
            }else if (arr[row][col]>key){
                // Top
                row --;
            }else{
                col++;
            }
        }


        System.out.println("Key not found!!!");
        return false;
    }
}




