
import java.util.ArrayList;
import java.util.List;

public class Q1 {

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        List<Integer> newArr = new ArrayList<>();
        findIndexes(arr, key, 0, newArr);

        for (int integer : newArr) {
            System.out.print(integer + " ");
        }
    }

    public static List<Integer> findIndexes(int[] arr, int key, int n, List<Integer> newArr) {
        if (n == arr.length - 1 && arr[n] == key) {
            // System.out.print(n);
            newArr.add(n);
            return newArr;
        }

        if (arr[n] == key) {
            // System.out.print(n + " ");
            newArr.add(n);
            return findIndexes(arr, key, n + 1, newArr);
        } else {
            return findIndexes(arr, key, n + 1, newArr);
        }

    }
}
