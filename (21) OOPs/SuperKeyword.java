

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        Animal a = new Animal();
        System.out.println(h.color);
        System.out.println(a.color);
    }
}


class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is called! ");
    }
    
}

class Horse extends Animal {
    Horse () {
        super.color= "brown";
        // super();
        System.out.println("Horse constructor is called");
    }
}