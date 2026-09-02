
public class FriendsPaiiringProblem {

    public static void main(String[] args) {
        int frn = 3;
        System.out.println(findways(frn));

    }

    public static int findways(int frn) {
        if (frn == 1 || frn == 2) {
            return frn;
        }

        int fm1 = findways(frn - 1);
        int fm2 = findways(frn - 2);

        return (fm1 + ((frn - 1) * fm2));
    }
}
