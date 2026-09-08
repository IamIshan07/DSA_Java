
public class SearchInSortedRoatedArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // answer = 4
        System.out.println(searchTarget(arr, target, 0, arr.length - 1));
    }

    public static int searchTarget(int[] arr, int target, int si, int ei) {

        //base case 
        if (si > ei) {
            return -1;
        }

        //find mid
        int mid = si + (ei - si) / 2; // (si+ei)/2
        if (arr[mid] == target) {
            return mid;
        }
        // check if mid is on L1?

        if (arr[si] <= arr[mid]) {
            //case :a - left search of L1
            if (arr[si] <= target && arr[mid] >= target) {
                return searchTarget(arr, target, si, mid - 1);
            } else {
                //case b: - right search of mid
                return searchTarget(arr, target, mid + 1, ei);
            }

        } // check if mid is on L2?
        else {
            // case c: - right search of L2
            if (arr[mid] <= target && target <= arr[ei]) {
                return searchTarget(arr, target, mid + 1, ei);
            } else {
                //case d: - left search of mid
                return searchTarget(arr, target, si, mid - 1);
            }

        }

    }
}
