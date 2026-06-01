public class MaxSAsum1{
    public static void FindMaxSubArraySum(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int m =1;
        for(int i = 0 ; i<number.length; i++){
            int start = i;
            for(int j = i;j<number.length;j++){
                int end = j;
                int current_sum=0;
                for(int k = start;k<=end;k++ ){
                    current_sum += number[k];
                }
                System.out.println("sum "+m+" is : "+current_sum);
                m++;
                if(current_sum>maxSum){
                    maxSum = current_sum;
                }
            }
        }
        System.out.println();
        System.out.println("max sum is :"+maxSum );
    }
    public static void main (String[] args){
        int numbers[] = {23,4,65,78,8,99};
        FindMaxSubArraySum(numbers);

    }
}