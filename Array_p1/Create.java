
import java.util.Scanner;

public class Create{
    public static void main(String[] args) {
        int marks [] = new int[50]; // here all the values are null / 0
        int marks2 [] = {12,23,33};
        String fruit [] = {"banana","mango","apple"};
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        System.out.println("Marks of sub1 : "+marks[0]);
        System.out.println("Marks of sub2 : "+marks[1]);
        System.out.println("Marks of sub3 : "+marks[2]);
        marks[2] = marks[2]+1;
        System.out.println("Marks of sub3 : "+marks[2]);
        int persentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("the percentage is : "+persentage+"%");

    }
}