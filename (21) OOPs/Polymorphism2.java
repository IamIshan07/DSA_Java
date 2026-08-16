
public class Polymorphism2 {

    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat(); 
    }
}

// Method overriding or, Run time Polymorphism or, Dynamic Polymorphism
class Animal {

    void eat() {
        System.out.println("Eats anything");

    }
}

class Deer extends Animal {

    void eat() {
        System.out.println("Eats grass");
    }
}
