/* Question : Use the following sorting algorithms to sort an array in DESCENDING order :

a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort

You can use this array as an example : 
[3, 6, 2, 1, 8, 7, 4, 5, 3, 1]


 */

public class PQ {

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // bubblesort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int biggestElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[biggestElement]) {
                    biggestElement = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[biggestElement];
            arr[biggestElement] = temp;

        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] < temp) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = temp;

        }
    }

    public static void countingSort(int[] arr) {
        // int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Integer.max(arr[i], max);
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = count.length-1 ; i >= 0; i--) {
            while(count[i]>0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
}
