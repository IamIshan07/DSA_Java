
public class MultipleInheritanceUsingInterfaces {

    public static void main(String[] args) {
        Bear don = new Bear();
        don.vegFood();
        don.nonvegFood();
    }
}

interface Herbivore {

    void vegFood();
}

interface Carnivore {

    void nonvegFood();
}

class Bear implements Herbivore, Carnivore {

    public void vegFood() {
        System.out.println("eats grass and all...");
    }

    public void nonvegFood() {
        System.out.println("also eats meat!");
    }
}
