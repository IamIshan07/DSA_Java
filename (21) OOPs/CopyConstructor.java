
public class CopyConstructor {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Ishan";
        s1.age = 21;
        s1.pass = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 89;
        s1.marks[2] = 10;

        Students s2 = new Students(s1);
        s2.pass = "xyz";
        s1.marks[2] = 98; //
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Students {

    int age;
    String name;
    String pass;
    int[] marks;

    //copy constructor
    public Students(Students s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
    }

    Students() {
        marks = new int[3];
        System.out.println("constructor id called.......!");
    }

    Students(int age) {
        marks = new int[3];
        this.age = age;
    }

    Students(String name) {
        marks = new int[3];
        this.name = name;
    }

    Students(String name, int age) {
        marks = new int[3];
        this.name = name;
        this.age = age;
    }

}
