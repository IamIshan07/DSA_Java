
public class StaticKeyword {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SAHS";

        Student s2 = new Student();
        System.out.println(Student.schoolName);

        Student s3 = new Student();
        s3.schoolName = "Brainware";
        System.out.println(s1.schoolName);
    }
}

class Student {

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
