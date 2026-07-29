import java.util.*;
public class tern{
    public static void main(String[] args) {
    //     int number = 41;
    //    String type = ((number%2) == 0) ? "even" : "odd";
    //    System.out.println("type of the number is : "+type);


    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    String status = (marks >= 33)? "pass" : "fail";
    System.out.println("You are : "+status);
    }
}


