// here is showing Abstract classes and abstruct methods.
public class Abstraction1 {

    public static void main(String[] args) {
        Horse thunder = new Horse();
        thunder.eat();
        thunder.walk();
        System.out.println(thunder.color);
        System.out.println(thunder.colorChange());

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        /*  Animal ape = new Animal();  -- is not possible because the Animal class is an abstract class! */


        Mustang ms = new Mustang();
    }
}

abstract class Animal {

    String color;

    Animal() {
        System.out.println("Animal constructor called!!");
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called!!");

    }

    String colorChange() {
        color = "green";
        return color;
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {

    Mustang() {
        System.out.println("Mustang constructor called!!");
    }

}

class Chicken extends Animal {

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
