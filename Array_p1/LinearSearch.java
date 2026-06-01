
import java.util.Scanner;


public class LinearSearch {

    public static int LinearSearch(int key, int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 6, 8, 10, 12, 14, 16, 20};
        // String menu[] = {"chicken","fish","egg","veg"};
        // int key = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your key :");
        int key = sc.nextInt();
        // if(LinearSearch(key, numbers)==-1){
        //     System.out.println("NOT FOUNF !!");
        // }else{                                                   This(commented) is not efficient !!

        // System.out.println("key is at index :"+LinearSearch(key, numbers));
        // }
        int result = LinearSearch(key, numbers); // Run search once

        if (result == -1) {
            System.out.println("NOT FOUND !!");
        } else {
            System.out.println("Key is at index: " + result);
        }
    }
}
