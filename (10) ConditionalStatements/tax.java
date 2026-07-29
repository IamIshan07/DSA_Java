
 import java.util.Scanner;

public class tax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        long Tax;
        if (income < 500000) {
            Tax = (income * 0);
        } else if (income >= 500000 && income < 1000000) {
            Tax = (long)(income * 0.2);
        } else {
            Tax = (long)(income * 0.3);
        }
        System.out.println("Your payable tax is : "+Tax);
    }
}
