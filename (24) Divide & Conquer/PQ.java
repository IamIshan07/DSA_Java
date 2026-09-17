
public class PQ {

    public static void main(String[] args) {
        // // Q1
        // String[] str = {"sun", "earth", "mars", "mercury"};
        // q1MergeSort(str, 0, str.length - 1);
        // printStrArray(str);
        // // Q2
        // int[] arr = {2, 2, 1, 1, 1, 2, 2};
        // System.out.println(q2(arr, 0, arr.length - 1));
        //Q3
        int[] arr2 = {10, 2, 4, 1, 3, 5};
        System.out.println(q3(arr2, 0, arr2.length - 1));
    }
//-----------------------------------------------------------------------------------

    /*
        Question 1 : 
            Apply Merge sort to sort an array of Strings. (Assume that all the characters in all the Strings are in lowercase). (EASY)
            Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
            Sample Output 1 : arr = { "earth", "mars", "mercury", "sun"}
     */
    public static void q1MergeSort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        q1MergeSort(arr, si, mid);
        q1MergeSort(arr, mid + 1, ei);

        joinQ1(arr, si, mid, ei);
    }

    public static void joinQ1(String[] arr, int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        String[] str = new String[ei - si + 1];
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                str[k] = arr[i];
                i++;
            } else {
                str[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            str[k++] = arr[i++];
        }

        while (j <= ei) {
            str[k++] = arr[j++];
        }

        for (i = si, k = 0; k < str.length; i++, k++) {
            arr[i] = str[k];
        }
    }

    public static void printStrArray(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
//-----------------------------------------------------------------------------------

    /*
        Question 2 : 
            Given an array nums of size n, return the majority element. (MEDIUM)

            The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

            Sample Input 1 : nums = [3,2,3]
            Sample Output 1 : 3

            Sample Input 2 : nums = [2,2,1,1,1,2,2]
            Sample Output 2 : 2
            
            Constraints (extra Conditions):
            ● n == nums.length
            ● 1 <= n <= 5 * 104
            ● -109 <= nums[i] <= 109
     */
    public static int q2(int[] arr, int si, int ei) {
        if (si >= ei) {
            return arr[si];
        }

        int mid = si + (ei - si) / 2;
        int left = q2(arr, si, mid);
        int right = q2(arr, mid + 1, ei);

        if (left == right) {
            return left;
        }
        int leftCount = countInPart(arr, si, ei, left);
        int rightCount = countInPart(arr, si, ei, right);

        return leftCount > rightCount ? left : right;
    }

    public static int countInPart(int[] arr, int si, int ei, int me) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == me) {
                count++;
            }
        }
        return count;
    }

    /*
        Question 3 : 
            Given an array of integers. Find the Inversion Count in the array. (HARD)

            Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

            Sample Input 1 : N = 5, arr[ ] = {2, 4, 1, 3, 5}
            Sample Output 1 : 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3).

            Sample Input 2 : N = 5, arr[ ] = {2, 3, 4, 5, 6}
            Sample Output 2 : 0, because the array is already sorted

            Sample Input 3 : N = 3, arr[] = {5, 5, 5}
            Sample Output 3 : 0, because all the elements of the array are the same & already in a sorted manner.

            (Hint : A sorting algorithm will be used to solve this question.)
            Note - This question is important. Even if you are not able to come up with the approach, please understand the solution. 
     */
    public static int q3(int[] arr2, int si, int ei) {
        if (si >= ei) {
            return 0;
        }
        int mid = si + (ei - si) / 2;
        int l = q3(arr2, si, mid);
        int r = q3(arr2, mid + 1, ei);
        int invCount = mergeQ3(arr2, si, mid, ei);
        return l + r + invCount;
    }

    public static int mergeQ3(int[] arr, int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int count = 0;
        int temp[] = new int[ei - si + 1];
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
                count += mid - i + 1;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, j = 0; j < temp.length; i++, j++) {
            arr[i] = temp[j];
        }
        return count;
    }

}
