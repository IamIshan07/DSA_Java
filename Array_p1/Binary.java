
import java.util.Scanner;


public class Binary {

    public static int BinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //  comparison  
            if (numbers[mid] == key) { // found!
                return mid;
            }
            if (numbers[mid] < key) { // searching right side
                start = mid + 1;
            } else {                   // Searching left side
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 34, 56, 87, 45, 11, 1};
        // int key = 34;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your key : ");
        int key = sc.nextInt();
        int result = BinarySearch(numbers, key);
        if(result == -1){
        System.out.println("Not found!!");
        }else{
            System.out.println("your number's index is :"+result);
        }
    }
}
