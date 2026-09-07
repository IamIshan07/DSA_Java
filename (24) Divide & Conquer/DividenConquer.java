// --------------Merge Sort
public class DividenConquer {

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, -7, -4};
        mergeSort(arr, 0, arr.length - 1);
        prinrArr(arr);
    }

    public static void prinrArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        // Work
        int mid = si + (ei - si) / 2; // (si + ei)/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; //iterater for left part
        int j = mid + 1; //iterater for right part
        int k = 0; //iterater for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part left elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //Copy temporary to Original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }
}
