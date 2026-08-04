
public class FastEponentiation {

    public static void main(String[] args) {
        int a = 3;  // number
        int n = 5;  //power
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;

            }
            a *= a;
            n = n >> 1;
        }
        System.out.println("The fast exponentiation of a^n is : "+ans);
    }
}
