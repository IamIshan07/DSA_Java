
public class FirstOccurance {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 12, 3, 4, 9};
        System.out.println(firstOccuranceOfNumber(arr, 0, 9));
    }

    public static int firstOccuranceOfNumber(int[] arr, int index, int num) {
        if (index == arr.length - 1) {
            int result = arr[index] == num ? index : -1;
            return result;
        }

        if (arr[index] == num) {
            return index;
        }

        return firstOccuranceOfNumber(arr, index + 1, num);
    }
}
