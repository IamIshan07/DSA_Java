
public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 3;
        findWays(n, "A", "B", "C");
    }

    public static void findWays(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk " + n + " frm " + src + " to " + dest);
            return;
        }

        findWays(n - 1, src, dest, helper);
        System.out.println("Move disk " + n + " frm " + src + " to " + dest);
        findWays(n - 1, helper, src, dest);

    }
}
