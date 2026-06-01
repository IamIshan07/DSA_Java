public class Pair{
    public static void FindPair(int numbers[]) {
        int TP = 0;
        for(int i = 0; i<numbers.length;i++){
            // int current = numbers[i];
            for(int j = i+1;j<numbers.length; j++){
                System.out.print("( "+numbers[i]+","+numbers[j]+" ) ");
                // System.out.print("( "+current+","+numbers[j]+" ) ");
                TP++;
            }
            System.out.println();
        }
        System.out.println("Total pair is :"+TP);
    }
    public static void main(String[] args) {
        int numbers [] = {2,3,4,5,6,7};
        FindPair(numbers);

    }
}