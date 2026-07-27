public class DigonalSum {
    public static void main(String[] args) {
        int[][] arr  = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        System.out.println("The Digonal sum is : "+digonalSum(arr));
    }

    public static int digonalSum(int[][] arr){
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.length;

        // Primary Digonal sum

        // Broot Force

        /*
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[0].length; j++) {
                if(i == j){
                    sum1 += arr[i][j];
                }
                else if(i+j == arr.length-1){
                    sum2+= arr[i][j];
                }   
            }
        }
         */



        // Optimized 


        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];

            if(i != n-1-i){
                sum2 += arr[i][n-1-i];
            }
        }
        int sum = sum1+sum2;
        return sum;
    }
}
