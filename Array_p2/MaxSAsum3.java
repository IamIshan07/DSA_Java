
public class MaxSAsum3 {

    public static void Kadanes(int numbers[]) {
        int CurrentSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            CurrentSum += numbers[i];

            max = Math.max(CurrentSum, max);

            if (CurrentSum < 0) {
                CurrentSum = 0;
            }

        }
        System.out.println("Maximum subarray sum is  : " + max);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(numbers);
    }
}
            // CurrentSum = Math.max(numbers[i], CurrentSum + numbers[i]);