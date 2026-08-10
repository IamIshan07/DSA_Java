
public class Constructors1and2 {

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students(21);
        Students s3 = new Students("Kabir");
        Students s4 = new Students("Ishan", 21);
        System.out.println(s2.age);
        System.out.println(s3.name);
        System.out.println(s4.name + "'s age is : " + s4.age);

    }
}
 
 

class Students {

    int age;
    String name;

    Students() {
        System.out.println("constructor id called.......!");
    }

    Students(int age) {
        this.age = age;
    }

    Students(String name) {
        this.name = name;
    }

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
