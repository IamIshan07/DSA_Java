// WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative

import java.util.*;
public class positive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int input = sc.nextInt();
        if(input >= 0){
            System.out.println("The given number is positive.");
        }else{
            System.out.println("The given number is negetive");
        }

    }
}