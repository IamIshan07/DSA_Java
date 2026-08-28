
public class Pow {

    public static void main(String[] args) {
        System.out.println(printXToThePowerN(2, 10));
    }

    public static int printXToThePowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * printXToThePowerN(x, n - 1);
    }
}
