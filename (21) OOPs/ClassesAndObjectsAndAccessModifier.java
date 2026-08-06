
public class ClassesAndObjectsAndAccessModifier {

    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1. // Object
        p1.setColor("red");
        System.out.println(p1.color);
        p1.color = "green";
        System.out.println(p1.color);
        p1.setTipSizw(10);
        System.out.println(p1.tipSize);

        BankAccount myAccount = new BankAccount();
        myAccount.setPassword("abcs");
        myAccount.userName = "Ishan Kar";
        System.out.println(myAccount.userName);

    }
}

class Pen {     // class

    //write Properties and Functions
    String color;
    int tipSize;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTipSizw(int newTipSize) {
        tipSize = newTipSize;
    }
}

class BankAccount {

    public String userName;
    private String password;  // Access Modifir!!

    public void setPassword(String pass) {
        password = pass;
        System.out.println(password);
    }
}
