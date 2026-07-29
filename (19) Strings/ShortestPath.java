
public class ShortestPath {

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        int m = 0;
        int n = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            if (direction == 'E') {
                m++;
            } else if (direction == 'W') {
                m--;
            } else if (direction == 'N') {
                n++;
            } else if (direction == 'S') {
                n--;
            }
        }
        double shortestDistance = Math.sqrt((Math.pow(m, 2) + Math.pow(n, 2)));
        System.err.println("The shortest path = " + shortestDistance);
    }
}
