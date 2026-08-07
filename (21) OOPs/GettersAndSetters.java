
public class GettersAndSetters {

    public static void main(String[] args) {
        Demo myDemo = new Demo();
        myDemo.setAge(2);
        System.out.println(myDemo.getAge());
        myDemo.setNumber("A+");
        System.out.println(myDemo.getNumber()); 

    }
}

class Demo {

    private int age;
    private String number;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void setNumber(String number){
        this.number = number;
    }
    String getNumber(){
        return this.number;
    }
}
