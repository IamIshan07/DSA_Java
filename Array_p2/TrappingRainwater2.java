
public class TrappingRainwater2 {

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("The total stored rainwater is : " + trappedRainwater(arr));
    }

    public static int trappedRainwater(int[] arr) {
        int n = arr.length;
        int totalTrappedRainwater = 0;

        if (n <= 2) {
            return 0;
        }

        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            totalTrappedRainwater += (Math.min(leftMax[i], rightMax[i]) - arr[i]);
        }
        return totalTrappedRainwater;
    }
}
