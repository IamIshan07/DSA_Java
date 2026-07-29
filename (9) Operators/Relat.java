
import java.util.Scanner;

public class Relat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a is greater than b , this statement is : "+(a>b));
        int c = 3;
        int d = 4;




        // Logical Operators.......................................



        System.out.println("(logical AND) : "+((a>b)&&(c<d)));
        System.out.println("(logical OR) : "+((a>b)||(c<d)));
        System.out.println("(logical NOT) : "+(!(a>b)));



        // Assignment Operators..............................
        System.out.println("(logical AND) : "+((a>b)&&(c<d)));
        c+=1;
        d=d-1;
        System.out.println("c's value now "+c);
        System.out.println("d's value now "+d);
        System.out.println("(logical AND) : "+((a>b)&&(c<d)));
    }
}