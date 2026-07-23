
public class BasicSorting {

    public static void main(String[] args) {
        // int[] arr = {1, 5, 4, 3, 2};
        Integer[] arr1 = {1, 5, 4, 3, 2};
        int[] arr2 = {1, 2, 3, 4, 4, 2, 2, 1, 1, 2, 5, 3};
        // int[] arr = {1,2,3,4,5};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        // Arrays.sort(arr1, Collections.reverseOrder());
        countingSort(arr2);
        // printArray(arr);
        // printArrayFirst(arr);
        printArraySecond(arr2);

    }

    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }
            }
            if (smallestIndex != i) {
                int temp = arr[smallestIndex];
                arr[smallestIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        // This is studied from NYC !!!
        //         int[] arr = {1, 5, 4, 3, 2};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] > key) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = key;
        }
    }

    public static void countingSort(int[] arr2) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            largest = Math.max(largest, arr2[i]);
        }
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr2.length; i++) {
            count[arr2[i]]++;
        }

        // Sorting 
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr2[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArrayFirst(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArraySecond(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
