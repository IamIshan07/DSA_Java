
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean alpha[] = new boolean[26];
        StringBuilder strNew = new StringBuilder("");
        System.out.println(removeString(str, 0, alpha, strNew));;
    }

    public static String removeString(String str, int i, boolean alpha[], StringBuilder strNew) {
        if (i == str.length()) {
            return strNew.toString();
        }
        if (alpha[(str.charAt(i) - 'a')] == true) {
            return removeString(str, i + 1, alpha, strNew);
        } else {
            alpha[str.charAt(i) - 'a'] = true;
            String new1 = strNew.append(str.charAt(i)).toString();
            return removeString(str, i + 1, alpha, strNew);
        }

    }
}
