
public class Stairs2 {

    // There are n stairs. You can climb either 1 step, 2 steps, or 3 steps at a time. How many distinct ways can you reach the top?
    public static void main(String[] args) {
        int stairs = 5;
        System.out.println(ways(stairs));

    }

    public static int ways(int stairs) {
        if (stairs == 0 || stairs == 1) {
            return 1;
        } else if (stairs == 2) {
            return 2;
        }

        return ways(stairs - 1) + ways(stairs - 2) + ways(stairs - 3);
    }
}
