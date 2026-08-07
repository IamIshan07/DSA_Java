
public class Constructors1and2 {

    public static void main(String[] args) {
        Students s1 = new Students();

    }
}

class Students {

    private int age;
    private String name;

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
