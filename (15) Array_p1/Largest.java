
public class Largest {

    public static int GetLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // here the MIN_VALUE means " - infinity "
        int Smallest = Integer.MAX_VALUE; // here the MIN_VALUE means " - infinity "
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if(numbers[i]<Smallest){
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+Smallest);
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = {2, 34, 56, 87, 45, 11, 1};
        System.out.println("The largest number of the array is : " + GetLargest(numbers));
    }
}
