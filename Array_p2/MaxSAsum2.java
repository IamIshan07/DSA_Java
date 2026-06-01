public class MaxSAsum2{

    public static void FindMaxSubArraySum(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i = 1 ; i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
            
        }

        for(int a = 0; a<numbers.length;a++){
            int start = a;
            for(int b = a;b<numbers.length;b++){
                // int CurrentSum =  0;
                int end = b;
                int CurrentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(CurrentSum>max){
                    max = CurrentSum;
                }

            }
        }
        System.out.println("Max sum is : "+max);

        
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        FindMaxSubArraySum(numbers);
    }
}