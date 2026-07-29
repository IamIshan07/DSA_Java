
import java.util.Scanner;

public class TrappingRainwater {

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width : ");
        int width = sc.nextInt();
        System.out.println("The total Trapping rain water is : " + trappingRainwater(arr, width));

    }

    public static int trappingRainwater(int[] height, int width) {
        int totalRainwater = 0;
        int n = height.length;

        if (n <= 2) {
            return 0;
        }
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            if (height[i] < leftMax[i] && height[i] < rightMax[i]) {
                totalRainwater += (Math.min(leftMax[i], rightMax[i]) - height[i]) * width;
            }
        }

        return totalRainwater;
    }
}
