
public class Inheritance {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

    }
}

// Base class or parent --------------------------------
class Animal {

    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");
    }
}



// Derived class or child ------------------------------------
// It is also a Single level Inheritance!---
class Fish extends Animal {

    int fins;

    void swims() {
        System.out.println("Swims in water.");
    }
}
