
public class MultiLevelInheritance {

    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.eat();
        System.out.println(dobby.legs);

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

class Mammal extends Animal {

    int legs;
}

class Dog extends Mammal { // multi level Inheritance

    String bread;
}



