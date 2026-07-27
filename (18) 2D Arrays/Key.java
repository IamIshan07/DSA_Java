public class Key {
    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        int key = 27;
        keyFind(key, arr);
    }

    public static void keyFind(int key, int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int startingIndex = 0;
            int endingIndex = n - 1;
            while (startingIndex <= endingIndex) {
                int mid = (startingIndex + endingIndex)/2;
                if (arr[i][mid] == key) {
                    System.out.println("The key is on the index : " + i + "," + mid);
                    return;
                } else if (arr[i][mid] > key) {
                    endingIndex = mid - 1;
                } else {
                    startingIndex = mid + 1;
                }
            }
        }   
        System.out.println("Key not found");
    }
}
