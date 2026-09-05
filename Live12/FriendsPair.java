
public class FriendsPair {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairFind(n));
    }

    public static int pairFind(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return pairFind(n - 1) + pairFind(n - 2) * (n - 1);
    }
}
