
public class Stairs {

    // There are n stairs. You can climb either 1 step or 2 steps at a time. How many ways can you reach the top?
    public static void main(String[] args) {
        int stairs = 10;
        System.out.println(ways(stairs));;
    }

    public static int ways(int stairs) {
        if (stairs == 0 || stairs == 1) {
            return 1;
        }

        return ways(stairs - 1) + ways(stairs - 2);
    }
}
