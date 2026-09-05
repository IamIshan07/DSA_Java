
public class Q2 {

    static String[] numsStr = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) {
        int n = 1236594;

        if (n == 0) {
            System.out.println("zero");
        } else {
            StringBuilder sb = new StringBuilder();
            convertToString(n, sb, numsStr);
            System.out.println(sb.toString().trim());
        }

    }

    public static void convertToString(int n, StringBuilder sb, String[] strdigits) {
        if (n == 0) {
            return;
        }

        int r = n % 10;
        convertToString(n / 10, sb, strdigits);
        // System.out.print(strdigits[r] + " ");
        sb.append(strdigits[r]).append(" ");
    }
}
