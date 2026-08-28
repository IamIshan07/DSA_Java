
public class LastOccurance2 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3};
        System.out.println(lastOccuranceOfNumber(arr, 0, 1));
    }

    public static int lastOccuranceOfNumber(int[] arr, int i, int key) {
        if (i == arr.length - 1) {
            int result = arr[i] == key ? i : -1;
            return result;
        }

        int check = lastOccuranceOfNumber(arr, i + 1, key);

        if (check == -1 && arr[i] == key) {
            return i;
        }
        return check;
    }
}
