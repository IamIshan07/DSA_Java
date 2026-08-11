
public class HierarchicalInheritance {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Bird tiya = new Bird();
        tiya.breath();

    }
}

// Base class or parent --------------------------------
class Animal {

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {

    void swim() {
        System.out.println("Swimming");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("Flying");
    }
}
