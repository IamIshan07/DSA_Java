
public class TrappingRainwater3 {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("total water : "+trapTwoPointerApproach(height));

    }

    public static int trapTwoPointerApproach(int[] height) {
        int totalTrappedWater = 0;
        int n = height.length;
        int start = 0;
        int end = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        while (start < end) {
            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);
            if (leftMax < rightMax) {
                totalTrappedWater += leftMax - height[start];
                start++;
            } else {
                totalTrappedWater += rightMax - height[end];
                end--;
            }
        }
        return totalTrappedWater;
    }
}
