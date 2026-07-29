import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        String firstName = "Ishan";
        String lastName = "Kar";
        String name = firstName+" "+lastName;
        // String name2 = new String("Ishan Kar");
        // System.out.println(name);
        // System.out.println(name2);
        // input();
        lengthOfString(name);

        

    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your District name :");
        String dist = sc.nextLine();

        System.out.print("Enter your village name :");
        String vill = sc.next();

        
        System.out.println("your Village name is :" + vill);
        System.out.println("your District name is :" + dist);
    }
    public static void lengthOfString(String name) {
        System.out.println("Length of the String is :"+name.length());
        System.out.println("The character of index 0 is : "+name.charAt(0));
    }
}
