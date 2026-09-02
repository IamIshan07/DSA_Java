
public class BinaryString {

    public static void main(String[] args) {
        int strSize = 4;
        int lastPlace = 0;
        possibleString(strSize, lastPlace, "");

    }

    public static void possibleString(int strSize, int lastPlace, String str) {
        if (strSize == 0) {
            System.out.println(str);
            return;
        }

        // if (lastPlace == 0) {
        //     possibleString(strSize - 1, 0, str.append("0"));
        //     possibleString(strSize - 1, 1, str.append("1"));
        // } else {
        //     possibleString(strSize - 1, 0, str.append("0"));
        // }
        possibleString(strSize - 1, 0, str + "0");
        if (lastPlace == 0) {
            possibleString(strSize - 1, 1, str + "1");
        }

    }
}
