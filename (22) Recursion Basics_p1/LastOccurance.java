
public class LastOccurance {

    public static void main(String[] args) {
        int arr[] = {12, 4, 343, 5, 5, 65, 766, 7, 6, 8, 78, 798};
        System.out.println(lastOccuranceOfNumber(arr, arr.length - 1, 5));
    }

    

    static int lastOccuranceOfNumber(int[] arr, int i, int key) {
        if (i == 0) {
            int result = arr[i] == key ? i : -1;
            return result;
        }

        if (arr[i] == key) {
            return i;
        }

        return lastOccuranceOfNumber(arr, i - 1, key);
    }
}
