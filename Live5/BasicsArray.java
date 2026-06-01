
import java.util.Scanner;

public class BasicsArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array you want to create : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter the value in "+ i +"th index : ");
            arr [i]=sc.nextInt();
        }
        System.out.println("Your final array is : ");{
            for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}