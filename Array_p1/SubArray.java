
public class SubArray {

    public static void FindSubArray(int Number[]) {
        int TSA = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < Number.length; i++) {
            int Start = i;
            for (int j = i; j < Number.length; j++) {
                int end = j;
                int currentsum = 0;
                for (int k = Start; k <= end; k++) {
                    System.out.print(Number[k] + " ");
                    currentsum += Number[k];
                }
                TSA++;
                System.out.println("Sum of this subArray is : ( " + currentsum + " )");
                if (currentsum < min) {
                    min = currentsum;
                }
                if (currentsum > max) {
                    max = currentsum;
                }
            }
            System.out.println();
        }
        System.out.println("Total sub array : " + TSA);
        System.out.println("max value of subarray sum : " + max);
        System.out.println("min value of subarray sum : " + min);
    }

    public static void main(String[] args) {
        int number[] = {12, 2, 33, 54, 45};
        FindSubArray(number);

    }
}
