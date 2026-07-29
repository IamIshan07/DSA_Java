
public class brk {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello world");
            if (i == 3) {
                break;
            }
        }
        System.out.println("I am out of the loop!");
    }
}
