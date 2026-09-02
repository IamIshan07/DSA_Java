// This is a practice of Remove duplicates!

public class Rd {

    public static void main(String[] args) {
        String str = "iisshhaann";
        StringBuilder sb = new StringBuilder();
        boolean arr[] = new boolean[26];
        int idx = 0;
        System.out.println(rD(str, sb, arr, idx));

    }

    public static String rD(String str, StringBuilder sb, boolean[] arr, int idx) {
        if (idx == str.length()) {
            return sb.toString();
        }
        if (arr[str.charAt(idx) - 'a'] == true) {
            return rD(str, sb, arr, idx + 1);
        } else {
            arr[str.charAt(idx) - 'a'] = true;
            sb.append(str.charAt(idx));
            return rD(str, sb, arr, idx + 1);
        }
    }
}
